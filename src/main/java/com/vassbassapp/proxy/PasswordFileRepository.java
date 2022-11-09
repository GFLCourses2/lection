package com.vassbassapp.proxy;

import com.vassbassapp.repository.PasswordRepository;
import com.vassbassapp.repository.PasswordSessionRepository;

import java.io.*;
import java.util.Collection;

/**
 * Singleton
 * Proxy
 */
public class PasswordFileRepository implements PasswordRepository {
    private static volatile PasswordFileRepository instance;
    private PasswordSessionRepository repo;

    private PasswordFileRepository(){}

    public static PasswordFileRepository getInstance(){
        if (instance == null) {
            synchronized (PasswordFileRepository.class){
                if (instance == null) {
                    instance = new PasswordFileRepository();
                }
            }
        }
        return instance;
    }

    @Override
    public Collection<String> getAll() {
        if (repo == null) {
            repo = getRepoFromFile();
        }
        return repo.getAll();
    }

    @Override
    public boolean add(String password) {
        repo.add(password);
        return saveRepoToFile(repo);
    }

    @Override
    public boolean isExists(String password) {
        return repo.isExists(password);
    }

    @Override
    public void clear() {
        repo.clear();
    }

    @Override
    public int size() {
        return repo.size();
    }

    private PasswordSessionRepository getRepoFromFile(){
        File repoFile = new File("repository.dat");
        if (repoFile.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(repoFile))) {
                 return (PasswordSessionRepository) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return new PasswordSessionRepository();
    }

    private boolean saveRepoToFile(PasswordSessionRepository repo) {
        File repoFile = new File("repository.dat");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(repoFile))) {
            if (!repoFile.exists()) {
                repoFile.createNewFile();
            }
            oos.writeObject(repo);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}

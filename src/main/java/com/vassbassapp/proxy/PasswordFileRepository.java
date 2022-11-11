package com.vassbassapp.proxy;

import com.vassbassapp.repository.PasswordRepository;
import com.vassbassapp.repository.PasswordSessionRepository;
import com.vassbassapp.service.publisherSubscriber.MessageManager;
import com.vassbassapp.service.publisherSubscriber.MessagePublisher;
import com.vassbassapp.service.publisherSubscriber.Title;

import java.io.*;
import java.util.Collection;

/**
 * Singleton
 * Proxy
 */
public class PasswordFileRepository implements PasswordRepository, MessagePublisher {
    private static volatile PasswordFileRepository instance;
    private PasswordSessionRepository repo;
    private File repositoryFile;
    private MessageManager messageManager;

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
        if (repo == null) repo = getRepoFromFile();

        return repo.getAll();
    }

    @Override
    public boolean add(String password) {
        if (repo == null) repo = getRepoFromFile();

        if (repo.add(password)) {
            return saveRepoToFile(repo);
        }else {
            if (messageManager != null) {
                messageManager.invoke(Title.MESSAGE,
                        "The password has already been generated");
            }
            return false;
        }
    }

    @Override
    public boolean isExists(String password) {
        if (repo == null) repo = getRepoFromFile();

        return repo.isExists(password);
    }

    @Override
    @SuppressWarnings("ResultOfMethodCallIgnored")
    public void clear() {
        if (repo != null) {
            repo.clear();
            if (repositoryFile != null && repositoryFile.exists()) repositoryFile.delete();
        }
    }

    @Override
    public int size() {
        if (repo == null) repo = getRepoFromFile();

        return repo.size();
    }

    private PasswordSessionRepository getRepoFromFile(){
        if (repositoryFile == null) repositoryFile = new File("repository.dat");
        if (repositoryFile.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(repositoryFile))) {
                Object r = ois.readObject();
                if (r instanceof PasswordSessionRepository) {
                    return (PasswordSessionRepository) r;
                }
            } catch (IOException | ClassNotFoundException e) {
                if (messageManager != null) messageManager.invoke(Title.ERROR, e.toString());
            }
        }
        return new PasswordSessionRepository();
    }

    @SuppressWarnings("ResultOfMethodCallIgnored")
    private boolean saveRepoToFile(PasswordSessionRepository repo) {
        if (repositoryFile == null) repositoryFile = new File("repository.dat");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(repositoryFile))) {
            if (!repositoryFile.exists()) {
                repositoryFile.createNewFile();
            }
            oos.writeObject(repo);

            if (messageManager != null) messageManager.invoke(Title.MESSAGE,
                    "The password has been saved");
            return true;
        } catch (IOException e) {
            if (messageManager != null) messageManager.invoke(Title.ERROR, e.toString());
            return false;
        }
    }

    @Override
    public void setMessageManager(MessageManager manager) {
        messageManager = manager;
    }
}

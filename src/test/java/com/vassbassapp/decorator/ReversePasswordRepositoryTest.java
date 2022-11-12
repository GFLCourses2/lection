package com.vassbassapp.decorator;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;

import com.vassbassapp.proxy.PasswordFileRepository;
import com.vassbassapp.repository.PasswordRepository;
import com.vassbassapp.repository.PasswordSessionRepository;

public class ReversePasswordRepositoryTest {
    private static PasswordRepository repository;

    private static final File repositoryFile = new File("repository.dat");
    private static final File tempFile = new File("temp.dat");

    @BeforeClass
    public static void createTemp() throws IOException {
        if (repositoryFile.exists()) {
            Files.copy(repositoryFile.toPath(), tempFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
        }

        repository = new ReversePasswordRepository(PasswordFileRepository.getInstance());
    }

    @AfterClass
    @SuppressWarnings("ResultOfMethodCallIgnored")
    public static void clearTemp() throws IOException {
        if (tempFile.exists()) {
            Files.copy(tempFile.toPath(), repositoryFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            tempFile.delete();
        }
    }

    @After
    public void clearRepository() {
        repository.clear();
    }

    @Test

    public void testGetAll() throws FileNotFoundException, IOException, ClassNotFoundException{
        String password1 = "password1";
        String password2 = "password2";
        String password3 = "password3";
        String[] expected = new String[] {password1, password2, password3};

        String[] expectedReverse = new String[]{"1drowssap" , "2drowssap", "3drowssap"};

        repository.add(password1);
        repository.add(password2);
        repository.add(password3);

        PasswordSessionRepository psr;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(repositoryFile))) {
            Object r = ois.readObject();
            if (r instanceof PasswordSessionRepository) {
                psr = (PasswordSessionRepository) r;
            } else {
                psr = new PasswordSessionRepository();
            }
        }
        List<String> actual = new ArrayList<>(psr.getAll());
        
        assertArrayEquals(expected, repository.getAll().toArray(new String[0]));
        assertArrayEquals(expectedReverse, actual.toArray(new String[0]));
    }

    @Test
    public void testAddNewPassword() throws FileNotFoundException, IOException, ClassNotFoundException{
        String expected = "password";
        String expectedReverse = "drowssap";

        assertTrue(repository.add(expected));
        assertTrue(repository.isExists(expected));

        PasswordSessionRepository psr;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(repositoryFile))) {
            Object r = ois.readObject();
            if (r instanceof PasswordSessionRepository) {
                psr = (PasswordSessionRepository) r;
            } else {
                psr = new PasswordSessionRepository();
            }
        }
        List<String> actual = new ArrayList<>(psr.getAll());

        assertEquals(expectedReverse, actual.get(0));
    }

    @Test
    public void testAddExistedPassword() throws FileNotFoundException, IOException, ClassNotFoundException{
        String password = "password";
        String expectedReverse = "drowssap";

        assertTrue(repository.add(password));
        assertFalse(repository.add(password));
        assertTrue(repository.isExists(password));

        PasswordSessionRepository psr;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(repositoryFile))) {
            Object r = ois.readObject();
            if (r instanceof PasswordSessionRepository) {
                psr = (PasswordSessionRepository) r;
            } else {
                psr = new PasswordSessionRepository();
            }
        }
        List<String> actual = new ArrayList<>(psr.getAll());

        assertEquals(expectedReverse, actual.get(0));
    }

    @Test
    public void testAddNull(){
        assertFalse(repository.add(null));
    }

    @Test
    public void testIsExists(){
        String password = "password";
        repository.add(password);

        assertTrue(repository.isExists(password));
        assertTrue(repository.isExists(null));
        assertFalse(repository.isExists("drowssap"));
    }

    @Test
    public void testClear(){
        String password1 = "password1";
        String password2 = "password2";
        String password3 = "password3";

        repository.add(password1);
        repository.add(password2);
        repository.add(password3);

        assertTrue(repository.size() > 0);
        assertTrue(repository.isExists(password2));

        repository.clear();

        assertFalse(repository.isExists(password2));
        assertFalse(repository.size() > 0);
    }

    @Test
    public void testSize(){
        String password1 = "password1";
        String password2 = "password2";
        String password3 = "password3";

        repository.add(password1);
        assertEquals(1, repository.size());

        repository.add(password2);
        assertEquals(2, repository.size());

        repository.add(password3);
        assertEquals(3, repository.size());
    }
}

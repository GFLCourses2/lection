package com.vassbassapp.proxy;

import com.vassbassapp.repository.PasswordRepository;
import org.junit.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import static org.junit.Assert.*;

public class PasswordFileRepositoryTest {
    private static PasswordRepository repository;

    @BeforeClass
    public static void createTemp() throws IOException {
        File repositoryFile = new File("repository.dat");
        if (repositoryFile.exists()) {
            Path temp = Paths.get("temp.dat");
            Path original = repositoryFile.toPath();
            Files.copy(original, temp, StandardCopyOption.REPLACE_EXISTING);
        }

        repository = PasswordFileRepository.getInstance();
    }

    @AfterClass
    @SuppressWarnings("ResultOfMethodCallIgnored")
    public static void clearTemp() throws IOException {
        File temp = new File("temp.dat");
        if (temp.exists()) {
            Path repositoryFile = Paths.get("repository.dat");
            Path original = temp.toPath();
            Files.copy(original, repositoryFile, StandardCopyOption.REPLACE_EXISTING);
            temp.delete();
        }
    }

    @After
    public void clearRepository() {
        repository.clear();
    }

    @Test
    public void testGetInstance() {
        assertSame(repository, PasswordFileRepository.getInstance());
    }

    @Test
    public void testGetAll(){
        String password1 = "password1";
        String password2 = "password2";
        String password3 = "password3";
        String[] expected = new String[] {password1, password2, password3};

        repository.add(password1);
        repository.add(password2);
        repository.add(password3);

        assertArrayEquals(expected, repository.getAll().toArray(new String[0]));
    }

    @Test
    public void testAddNewPassword(){
        String expected = "password";

        assertTrue(repository.add(expected));
        assertTrue(repository.isExists(expected));
    }

    @Test
    public void testAddExistedPassword(){
        String password = "password";

        assertTrue(repository.add(password));
        assertFalse(repository.add(password));
        assertTrue(repository.isExists(password));
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
        assertFalse(repository.isExists("not existed"));
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
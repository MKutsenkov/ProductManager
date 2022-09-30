            //package ru.netology;

//import repository.Repository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.*;

import static org.junit.jupiter.api.Assertions.*;

public class ManagerTest {

    Repository repository = new Repository();
    Manager manager = new Manager(repository);
    Product book = new Book(1, "Буратино", 5,  "Толстой");
    Product smartphone = new Smartphone(2, "Xperia", 100000, "Sony");


    @BeforeEach

    public void Product() {
    manager.add(book);
    manager.add(smartphone);
    }

    @Test
    public void findAuthorBook() {
        Product[] expected = {book};
        Product[] actual = manager.searchBy("Толстой");
        assertArrayEquals(expected,actual);
    }

    @Test
    public void findNameBook() {
        Product[] expected = {book};
        Product[] actual = manager.searchBy("Буратино");
        assertArrayEquals(expected,actual);
    }

    @Test
    public void findNameManufacturerSmartphone() {
        Product[] expected = {smartphone};
        Product[] actual = manager.searchBy("Sony");
        assertArrayEquals(expected,actual);
    }
    @Test
    public void findNameSmartphone() {
        Product[] expected = {smartphone};
        Product[] actual = manager.searchBy("Xperia");
        assertArrayEquals(expected,actual);
    }



}
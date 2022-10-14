
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.*;

import static org.junit.jupiter.api.Assertions.*;

public class ManagerTest {

    Repository repository = new Repository();
    Manager manager = new Manager(repository);
    Product book = new Book("Буратино", 500,  "Толстой");
    Product smartphone = new Smartphone("Xperia", 100000, "Sony");


    @BeforeEach

    public void Product() {
        manager.add(book);
        manager.add(smartphone);
    }
    // КНИГИ
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
    public void notFindAuthorBook() {
        Product[] expected = {};
        Product[] actual = manager.searchBy(null);
        assertArrayEquals(expected,actual);
    }







    // Смартфоны
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

    @Test
    public void notFindNull() {
        Product[] expected = {};
        Product[] actual = manager.searchBy(null);
        assertArrayEquals(expected,actual);
    }

}

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.*;

import static org.junit.jupiter.api.Assertions.*;

public class ManagerTest {

    Repository repository = new Repository();
    Manager manager = new Manager(repository);

    Product book = new Book(1, "Буратино", 100, "Толстой");
    Product book1 = new Book(2, "Буратино1", 200, "Толстой1");
    Product book2 = new Book(3, "Буратино2", 200, "Толстой2");
    Product book3 = new Book(4, "Буратино3", 300, "Толстой3");


    Product smartphone = new Smartphone(5, "Xperia", 10000, "Sony");
    Product smartphone1 = new Smartphone(6, "Xperia1", 20000, "Sony1");

    Product smartphone2 = new Smartphone(7, "Xperia2", 30000, "Sony2");
    Product smartphone3 = new Smartphone(8, "Xperia3", 40000, "Sony3");


    @BeforeEach

    public void Product() {
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(book);

        manager.add(smartphone);
        manager.add(smartphone2);
        manager.add(smartphone3);
        manager.add(smartphone1);

    }
    // КНИГИ


    @Test
    public void findAuthorBook() {
        Product[] expected = {book};
        Product[] actual = manager.searchBy("Толстой");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void findNameBook() {
        Product[] expected = {book};
        Product[] actual = manager.searchBy("Буратино");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void notFindAuthorBook() {
        Product[] expected = {};
        Product[] actual = manager.searchBy(null);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void notFindAuthorBook1() {
        Product[] expected = {};
        Product[] actual = manager.searchBy("Газета");
        assertArrayEquals(expected, actual);
    }


    // Смартфоны
    @Test
    public void findNameManufacturerSmartphone() {
        Product[] expected = {smartphone1};
        Product[] actual = manager.searchBy("Sony1");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void findNameSmartphone() {
        Product[] expected = {smartphone3};
        Product[] actual = manager.searchBy("Xperia3");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void notFindNull() {
        Product[] expected = {};
        Product[] actual = manager.searchBy(null);
        assertArrayEquals(expected, actual);
    }


}
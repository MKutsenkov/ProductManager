package ru.netology;
import ru.netology.Product;

public class Repository {
    private Product[] products = new Product[0];

    public void save(Product product) {
        int length = products.length + 1;
        Product[] add1 = new Product[length];
        System.arraycopy(products, 0, add1, 0, products.length);
        int last = add1.length - 1;
        add1[last] = product;
        products = add1;
    }

    public Product[] getAll() {
        return products;
    }

    public Product[] remId(int id) {
        int length = products.length - 1;
        Product[] add1 = new Product[length];
        int index = 0;
        for (Product product : products) {
            if (product.getId() != id) {
                add1[index] = product;
                index++;
            }
        }
        products = add1;
        return products;
    }
}
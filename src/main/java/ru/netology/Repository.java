package ru.netology;

import java.util.ArrayList;

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

    public void remId(int id) {
        var buffer = new ArrayList<Product>();
        for (Product product : products) {
            if (product.getId() != id) {
                buffer.add(product);
            }
        }
        products = buffer.toArray(new Product[0]);
    }
}
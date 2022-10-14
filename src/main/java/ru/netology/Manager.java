package ru.netology;

import java.util.ArrayList;

public class Manager {
    private final Repository repository;

    public Manager(Repository repository) {
        this.repository = repository;
    }

    public void add(Product product) {
        repository.save(product);
    }

    public Product[] searchBy(String text) {    //  ЕЛЕ ЕЛЕ РАЗОБРАЛ. НАДО ДОВНИКАТЬ
        var result = new ArrayList<Product>();

        for (Product product : repository.getAll()) {
            if (product.match(text)) {
                result.add(product);
            }
        }
        return result.toArray(new Product[0]);
    }

}
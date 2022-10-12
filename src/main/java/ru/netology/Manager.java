package ru.netology;


import ru.netology.Repository;
import ru.netology.Book;
import ru.netology.Product;
import ru.netology.Smartphone;

public class Manager {
    private Repository repository;

    public Manager(Repository repository) {
        this.repository = repository;
    }

    public void add(Product product) {
        repository.save(product);
    }

    public Product[] searchBy(String text) {    //  ЕЛЕ ЕЛЕ РАЗОБРАЛ. НАДО ДОВНИКАТЬ
        Product[] result = new Product[0];
        for (Product product : repository.getAll()) {
            if (product.getName().contains(text)) {


                //if (matches(product, text)) {
                Product[] tmp = new Product[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
                // System.arraycopy(result, 0, tmp, 0, result.length);
                tmp[tmp.length - 1] = product;
                result = tmp;
            }
        }
        return result;
    }

    private boolean matches(Product product, String search) {
        if (product.getName().contains(search)) {
            return true;
        } else {
            return false;
        }
    }


    //   public boolean matches(Product product, String search) {
    //       if (product instanceof Book) {      // instanceof - РАЗОБРАТЬ!!
    //           Book book = (Book) product;
    //           if (book.getName().equalsIgnoreCase(search)) {  //  equalsIgnoreCase(search) ВОООБЩЕ НИЧЕГО НЕ ПОНЯЛ
    //               return true;
    //           }
    //
    //           return book.getAuthor().equalsIgnoreCase(search);
    //       }
    //       if (product instanceof Smartphone) {
    //           Smartphone smartphone = (Smartphone) product;
    //           if (smartphone.getName().equalsIgnoreCase(search)) {
    //               return true;
    //           }
    //           return smartphone.getManufacturer().equalsIgnoreCase(search);
    //       }
    //       return false;
    //   }


}

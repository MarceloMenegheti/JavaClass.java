package util;

import entities.Product;

import java.util.function.Predicate;

//interface funcional porque tem apenas um método abstrato a ser implementado.
public class ProductPredicate implements Predicate<Product> {

    @Override
    public boolean test(Product p) {
        return p.getPrice() <= 100.0;
    }
}

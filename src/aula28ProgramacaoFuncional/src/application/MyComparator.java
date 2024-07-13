package application;

import entities.Product;
import java.util.Comparator;

public class MyComparator implements Comparator<Product> {

    public int compare(Product obj1, Product obj2) {
        return obj1.getName().toUpperCase().compareTo(obj2.getName().toUpperCase());
    }


}

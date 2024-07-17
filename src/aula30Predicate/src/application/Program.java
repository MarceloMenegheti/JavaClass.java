package application;

import entities.Product;
import util.ProductPredicate;

import java.util.List;
import java.util.ArrayList;


public class Program {
    public static void main(String[] args){

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        for(Product p : list){
            System.out.println(p);
        }

        list.removeIf(new ProductPredicate());

        System.out.println("\n----\n");
        for(Product p : list){
            System.out.println(p);
        }

    }
}

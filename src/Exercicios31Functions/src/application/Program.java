package application;

import entities.Product;
import util.ProductServise;

import java.util.List;
import java.util.ArrayList;
import java.util.Locale;


public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        ProductServise ps = new ProductServise();

        //funcao mais flexivel
        double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'M');

        double sumM = ps.filteredSum(list, p -> p.getPrice() < 100.0);

        System.out.println("Sum = " + String.format("%.2f", sum));
        System.out.println("Soma dos produtos menores que 100.00 = " + String.format("%.2f", sumM));


    }
}

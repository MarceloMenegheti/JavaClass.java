package application;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;


public class Program {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = scan.nextLine();//variavel temporaria

        System.out.print("Price: ");
        double price = scan.nextDouble();

        //System.out.print("Quantity in Stock: ");
        //int quantity = scan.nextInt();

        //Product product = new Product(name, price, quantity);
        Product product = new Product(name, price);


        product.setName("Computer");
        product.setPrice(1200.00);
        
        System.out.println("Upadate name: "+ product.getName() + " | Update Price: "+product.getPrice());

        System.out.println("Products Data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = scan.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Upadated Data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be remove in stock: ");
        quantity = scan.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Upadated Data: " + product);



        scan.close();
    }
}

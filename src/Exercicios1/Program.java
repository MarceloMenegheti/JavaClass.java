package Exercicios1;

import java.util.Locale;
import java.util.Scanner;
import java.util.Scanner;

public class Program {
    
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        
        Product product =  new Product();

        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        product.name = scan.nextLine();

        System.out.println("Price: ");
        product.price = scan.nextDouble();

        System.out.println("Quantity in Stock: ");
        product.quantity = scan.nextInt();

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

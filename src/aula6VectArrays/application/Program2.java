package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program2 {
    public static void main(String[] args) {
        

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("inform the size of the Array: ");
        int n = sc.nextInt();

        Product[] vect = new Product[n];

        System.out.println();
        for(int i = 0; i < vect.length; i++){
            sc.nextLine();
            System.out.printf("Enter the name of the product[%d]: ",i);
            String name = sc.nextLine();
            System.out.printf("Enter the value of the product[%d]: ",i);
            double price = sc.nextDouble();
            vect[i] = new Product(name,price);
        }

        double sum = 0.0;

        for(int i = 0; i < vect.length; i++){
            sum += vect[i].getPrice();
        }

        double avg = sum / vect.length;
        System.out.printf("%nAverege Price: %.2f%n",avg);
        sc.close();

    }
}

package application;

import util.CurrencyConverter;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("what is the dollar price? ");
        double price = sc.nextDouble();
        System.out.print("How many dollar will be bought? ");
        double quantity = sc.nextDouble();

        double result = CurrencyConverter.quantityInReais(price,quantity);

        System.out.printf("Amount to be paid in Reais = %.2f%n",result);



        sc.close();
    }
}

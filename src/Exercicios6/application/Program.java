package application;

import entities.Bank;

import java.util.Locale;
import java.util.Scanner;

class Program {

    public static void main(String[] args) {
       
        double initialDeposit = 0.00;
    
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter accont number: ");
        int number = sc.nextInt();

        sc.nextLine();//zerar o buffer
        System.out.print("Enter accont holder: ");
        String name = sc.nextLine();
        
        System.out.print("Is there na initial deposit (y | n): ");
        char answer = sc.next().charAt(0);


        if(answer == 'y'){
            System.out.print("Enter initial deposit value: ");
            initialDeposit = sc.nextDouble();
        }

        Bank bank = new Bank(number,name,initialDeposit);

        System.out.println();
        System.out.println("Accont data:");
        System.out.println(bank);

        System.out.print("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        
        System.out.println();
        bank.AddDeposit(deposit);
        System.out.println("Update account data:");
        System.out.println(bank);
        System.out.println();

        System.out.print("Enter withdraw value: ");
        deposit = sc.nextDouble();

        bank.removeDeposit(deposit);

        System.out.println("Update account data:");
        System.out.println(bank);
        System.out.println();
        sc.close();
    }
    
}
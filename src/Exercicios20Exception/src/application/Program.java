package application;

import model.entities.Account;
import model.exceptions.BusinessException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Enter account data");
        System.out.print("number: ");
        int number = sc.nextInt();

        System.out.print("holder: ");
        sc.next();
        String titular = sc.nextLine();
        System.out.print("Initial balence: ");
        Double saldo = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        Double withdraw = sc.nextDouble();

        Account account = new Account(number,titular,saldo,withdraw);

        System.out.println();
        System.out.print("Enter amount for withdraw: ");
        Double amount = sc.nextDouble();

        try {
            account.withdraw(amount);
            System.out.printf("Novo saldo: %.2f%n", account.getSaldo());
        }
        catch (BusinessException e){
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}

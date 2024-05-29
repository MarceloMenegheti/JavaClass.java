package application;

import java.util.ArrayList;
import java.util.List;
import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;


public class Program {

    public static void main(String[] args) {

        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1001,"Marcelo",500.0,0.01));
        list.add(new BusinessAccount(1002,"Luiz",1000.0,400.0));
        list.add(new SavingsAccount(1003,"Leonardo",300.0,0.01));
        list.add(new BusinessAccount(1004,"Diego",500.0,500.0));


        double soma = 0;
        for(Account acc : list){
            soma += acc.getBalance();
        }

        System.out.printf("Total soma: %.2f%n",soma);

        for(Account acc : list){
            acc.deposit(10.0);
        }

        for(Account acc : list){
            System.out.printf("Update balence for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
        }

        double somaUpdated = 0;
        for(Account acc : list){
            somaUpdated += acc.getBalance();
        }

        System.out.printf("Total soma Updated: %.2f%n",somaUpdated);


    }
}
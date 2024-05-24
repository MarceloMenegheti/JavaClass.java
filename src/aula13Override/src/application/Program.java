package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args){

        Account acc = new Account(1001,"Alex",1000.0);
        acc.withDraw(200.0);
        System.out.println(acc.getBalence());

        Account acc1 = new SavingsAccount(1002,"Maria",1000.0,0.01);
        acc1.withDraw(200.0);
        System.out.println(acc1.getBalence());

        Account acc3 = new BusinessAccount(1003,"João",1000.0,500.0);
        acc3.withDraw(100.0);
        System.out.println(acc3.getBalence());
    }
}

package application;

import entities.Account;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args){

        Account x = new Account(1001,"Alex",1000.0);
        Account y = new SavingsAccount(1002,"Maria",1000.0,0.01);

        x.withDraw(50.0);//conta comum
        y.withDraw(50.0);//conta poupança

        System.out.println("x: " + x.getBalence());
        System.out.println("y: " +y.getBalence());

    }
}

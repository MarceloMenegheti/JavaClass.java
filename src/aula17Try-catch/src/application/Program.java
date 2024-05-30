package application;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Program {
    public static void main(String[] args){

        method1();
        System.out.println("End of program!");
    }

    public static void method1(){
        System.out.println("-----Metodo 1 Start-----");
        method2();
        System.out.println("-----Metodo 1 End-----");
    }

    public static void method2(){
        Scanner sc = new Scanner(System.in);

        System.out.println("-----Metodo 2 Start-----");

        try{
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position!");
            e.printStackTrace();
            sc.next();
        }
        catch (InputMismatchException e){
            System.out.println("Input error!");
        }

        System.out.println("-----Metodo 2 End-----");

        sc.close();
    }
}

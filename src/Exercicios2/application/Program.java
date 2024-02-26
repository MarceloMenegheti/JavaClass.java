package Exercicios2.application;

import Exercicios2.entities.Rectangle;
import java.util.Scanner;


public class Program {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Rectangle a = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
         a.width = scan.nextDouble();
         a.height = scan.nextDouble();


        System.out.printf("AREA = %.2f%n", a.area());
        System.out.printf("PERIMETER = %.2f%n", a.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", a.diagonal());
        scan.close();

    }
}

package application;

import entities.Employee;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Employee funcionario = new Employee();

        System.out.print("Nome: ");
        funcionario.name = sc.nextLine();

        System.out.print("Gross Salary: ");
        funcionario.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        funcionario.tax = sc.nextDouble();

        System.out.println("Employee: "+funcionario);
        System.out.print("Which percentege to increase salary? ");
        double percent = sc.nextDouble();

        funcionario.increaseSalary(percent);

        System.out.println("Upadate employee: "+funcionario);


    }
}

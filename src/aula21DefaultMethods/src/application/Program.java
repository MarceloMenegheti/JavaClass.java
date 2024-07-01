package application;
import services.BrazilInterestService;
import services.UsaInterestService;
import services.InterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("amount: ");
        double amount = sc.nextDouble();

        System.out.print("months: ");
        int months = sc.nextInt();

        InterestService is = new UsaInterestService(1.0);
        double payment = is.payment(amount, months);

        System.out.println("Payment after "+ months + " months");
        System.out.println(String.format("%.2f", payment));

        sc.close();
    }
}

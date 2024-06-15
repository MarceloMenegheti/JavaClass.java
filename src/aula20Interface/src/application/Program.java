package application;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do alugel ");
        System.out.print("modelo do carro: ");
        String model = sc.nextLine();
        System.out.print("retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(),fmt);
        System.out.print("retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(),fmt);

        CarRental cr = new CarRental(start,finish,new Vehicle(model));

        System.out.println();
        System.out.print("Entre com o preco por horas: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("entre o preco por dias: ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerDay,pricePerHour,new BrazilTaxService());

        rentalService.processInvoice(cr);

        System.out.println("\nfatura ");
        System.out.println("Pagamento basico: "+ cr.getInvoice().getBasicalPayment());
        System.out.println("Imposto: " + cr.getInvoice().getTax());
        System.out.println("Pagamento total: "+ cr.getInvoice().getTotalPayment());
        sc.close();
    }
}

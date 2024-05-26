package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();


        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for(int j = 1; j <= n; j++){
            System.out.println("Product #" + j + " data:");
            System.out.print("Commun, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Price: ");
            Double price = sc.nextDouble();

            if(ch == 'c'){
                list.add(new Product(name,price));

            }else if(ch == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct(name,price,date));

            }else{
                System.out.print("Customs fee: ");
                Double customsFee = sc.nextDouble();
                list.add(new ImportedProduct(name,price,customsFee));
            }

        }

        System.out.println();
        System.out.println("ETIQUETAS DE PRECO:");
        for(Product prod : list){
            System.out.println(prod.priceTag());
        }

        sc.close();
    }
}

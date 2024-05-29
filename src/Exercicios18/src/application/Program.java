package application;

import entities.Person;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Person> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i<= n; i++){
            System.out.println("Tax payer #"+i+" data:");

            System.out.print("Pessoa fisica ou Juridica (f/j)? ");
            char ch = sc.next().charAt(0);

            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Renda anual: ");
            Double rendaAnual = sc.nextDouble();

            if(ch == 'f'){
                System.out.print("Gastos com Saude: ");
                Double gastoComSaude = sc.nextDouble();
                list.add(new PessoaFisica(name,rendaAnual,gastoComSaude));

            }else{
                System.out.print("Numeros de Funcionarios: ");
                int numerosFuncionarios = sc.nextInt();
                list.add(new PessoaJuridica(name,rendaAnual,numerosFuncionarios));
            }
        }


        System.out.println();
        System.out.println("TAXES PAID:");
        for (Person p : list){

            System.out.print(p.getName()+ ": $ " + String.format("%.2f", p.totalImpostos()));
            System.out.println();
        }


        double sum = 0.0;

        for(Person p : list){
            sum += p.totalImpostos();
        }

        System.out.println();
        System.out.print("TOTAL TAXES: $ " + String.format("%.2f",sum));



        sc.close();
    }
}

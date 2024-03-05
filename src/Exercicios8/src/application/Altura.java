package application;

import java.util.Locale;
import java.util.Scanner;

public class Altura {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos pessoas serao digitadas? ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];


        for(int i = 0; i < n; i++){
            sc.nextLine();
            System.out.printf("Dados da %da pessoa",i+1);
            System.out.print("\nnome: ");
            nomes[i] = sc.nextLine();
            System.out.print("idade: ");
            idades[i] = sc.nextInt();
            System.out.print("nome: ");
            alturas[i] = sc.nextDouble();
            System.out.println();
        }

        int menores = 0;
        double alturaTotal = 0.0;

        for(int i = 0;  i < n; i++){

            if(idades[i]<16){
                menores++;
            }
            alturaTotal += alturas[i];
        }

        double porcentMenores = ((double)menores / n) * 100.0;

        System.out.println();
        System.out.printf("Altura Media: %.2f",(alturaTotal / n));
        System.out.println("\nPessoas com menos de 16 anos: "+ porcentMenores+"%");

        for(int i = 0;  i < n; i++) {

            if (idades[i] < 16) {
                System.out.println(nomes[i]);;
            }
        }

        sc.close();
    }
}

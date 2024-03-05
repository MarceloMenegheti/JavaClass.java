package application;

import java.util.Locale;
import java.util.Scanner;

public class MaisVelho {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();

        String[] names = new String[n];
        int[] idades = new int[n];

        for(int i = 0; i < n; i++){
            sc.nextLine();
            System.out.printf("Dados da %da pessoa: \n",i+1);
            System.out.print("nome: ");
            names[i] = sc.nextLine();
            System.out.print("idade: ");
            idades[i] = sc.nextInt();
        }

        String velho = "";
        int maior = idades[0];
        for(int i = 1; i < n; i++){
            if(idades[i] > maior){
                maior = idades[i];
                velho = names[i];
            }
        }

        System.out.println("A pessoa mais velha é "+velho);
        sc.close();
    }
}

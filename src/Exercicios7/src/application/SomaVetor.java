package application;

import java.util.Locale;
import java.util.Scanner;

//Problema "SOMA_VETOR"

public class SomaVetor {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] vect = new double[n];
        double sum = 0.0;

        for(int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }

        System.out.print("\nValores = ");
        for(int i = 0;i < n;i++){
            System.out.print(" " + vect[i]);
        }

        System.out.printf("%nSoma: %.2f", sum);
        double avg = 0.0;

        avg = sum/n;

        System.out.printf("%nMedia: %.2f", avg);

        sc.close();
    }
}

package application;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double[] vect = new double[n];
        double sum = 0.0;

        for(int i = 0; i < n; i++){
            System.out.print("Digite o numero: ");
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }

        double avg = (sum/n);

        System.out.println("\nmedia dos vetores = "+avg);


        System.out.println("Elementos abaixo da media:");
        for(int i=0;i<n;i++){
            if(vect[i] < avg){
                System.out.println(vect[i]);
            }
        }

        sc.close();
    }
}


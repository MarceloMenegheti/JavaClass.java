package application;

import java.util.Locale;
import java.util.Scanner;

class Program {
    public static void main(String[] args) {
     
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
    
        System.out.print("informe o tamanho do vetor: ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for(int i = 0; i < n; i++){
            System.out.printf("informe um novo numero [%d]: ",i);
            vect[i] = sc.nextDouble();  
        }

        double sum = 0.0;
        for(int i = 0;i<n;i++){
            sum += vect[i];
        }

        double avg = sum / n;

        System.out.printf("Averege: %.2f%n",avg);
        System.out.println();

        sc.close();

    }
    
}
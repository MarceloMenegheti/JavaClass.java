package application;
import java.util.Locale;
import java.util.Scanner;
import java.util.*;

public class MaiorPosicao {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] numeros = new double[n];

        for(int i = 0; i < numeros.length; i++){
            System.out.print("Digite o numero: ");
            numeros[i] = sc.nextDouble();
        }

        int posicao =0;
        double maior = numeros[0];

        for(int i = 1;i < numeros.length;i++){
            if(numeros[i] > maior){
                maior = numeros[i];
                posicao = i;
            }
        }

        System.out.print("\nMaior valor = "+maior);
        System.out.print("\nPosicao do maior Valor = "+posicao);

        sc.close();
    }
}

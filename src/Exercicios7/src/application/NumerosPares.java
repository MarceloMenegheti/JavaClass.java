package application;
import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        int[] numeros = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Digite o numero: ");
            numeros[i] = sc.nextInt();
        }

        int Qty = 0;

        System.out.println("\nNUMEROS PARES:");
        for(int i = 0; i<n;i++){
            if(numeros[i]%2 == 0){
                System.out.print(" "+numeros[i]);
                Qty++;
            }
        }

        System.out.println("\n\nQUANTIDADE DE PARES = " + Qty);

        sc.close();
    }
}

package application;
import java.util.Scanner;
public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        int[] numeros = new int[n];

        int[] max = new int[n];

        for(int i = 0;i < n;i++){
            System.out.print("Informe o numero: ");
            max[i] = sc.nextInt();

            if(max[i] < 11){
                numeros[i] = max[i];
            }
        }

        System.out.println("-----------------");

        for(int i = 0; i < n; i++){
            System.out.print(" | "+numeros[i]);
        }

        System.out.println("\n-----------------");
        System.out.println("Numeros Negativos: ");

        for(int i = 0; i < n; i++){
            if(numeros[i] < 0){
                System.out.println(numeros[i]);
            }
        }

        sc.close();
    }
}

package application;
import java.util.Locale;
import java.util.Scanner;


public class MediaPares {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int[] vect = new int[n];
        int numeroPares = 0;

        double sum = 0.0;
        for(int i = 0; i < n; i++){

            System.out.print("Digite o numero: ");
            vect[i] = sc.nextInt();

            if(vect[i] %2 == 0){
                sum += vect[i];
                numeroPares++;
            }
        }

        if(sum == 0) {
            System.out.printf("nenhum numero par");
        }else{
            System.out.println("Media dos pares = "+(sum/numeroPares));
        }


        sc.close();
    }
}

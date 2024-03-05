package application;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoais {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int n = sc.nextInt();

        double[] altura = new double[n];
        char[] genero = new char[n];

        for(int i = 0; i < n; i++){
            System.out.printf("Altura da %da pessoa: ",i+1);
            altura[i] = sc.nextDouble();
            System.out.printf("Genero da %da pessoa: ",i+1);
            genero[i] = sc.next().charAt(0);
        }

        double menor = altura[0];
        double maior = altura[0];
        double sum = 0.0;
        int numerosM = 0;
        int numerosH = 0;

        for(int i = 0; i < n; i++){

            if(altura[i] < menor){
                menor = altura[i];
            }

            if(altura[i] > maior){
                maior = altura[i];
            }
        }

        for(int i=0;i<n;i++){
            if(genero[i] == 'F'){
                sum += (altura[i]);
                numerosM++;
            }else{
                numerosH++;
            }
        }

        double avg = sum/numerosM;
        System.out.printf("\nMenor altura = %.2f", menor);
        System.out.printf("\nMaior altura = %.2f", maior);
        System.out.printf("\nMedia das alturas das mulheres = %.2f", avg);
        System.out.print("\nNumero de homens = " + numerosH);

        sc.close();
    }
}

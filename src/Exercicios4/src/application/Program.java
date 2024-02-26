package application;

import entities.Student;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Student aluno = new Student();

        aluno.name = sc.nextLine();
        aluno.nota1 = sc.nextDouble();
        aluno.nota2 = sc.nextDouble();
        aluno.nota3 = sc.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n", aluno.finalNota());

        if(aluno.finalNota() < 60.0){
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", aluno.missingPoints());

        }else{
            System.out.println("PASS!");
        }

        sc.close();
    }
}

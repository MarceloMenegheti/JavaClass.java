package application;

import entities.Client;

public class Program {
    public static void main(String[] args){
        Client c1 = new Client("Marcelo","marcelo@gmail.com");
        Client c2 = new Client("Marcelo","marcelo@gmail.com");

        //compilador tratamento especial
        String s1 = "test";
        String s2 = "test";

        //instanciando na memoria reap
        String s3 = new String("test");
        String s4 = new String("test");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));//comparar pelo conteudo dos objs
        System.out.println(c1 == c2);//comparar por referências
        System.out.println(s1 == s2);
        System.out.println(s3 == s4);
    }
}

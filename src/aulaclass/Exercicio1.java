package aulaclass;
import java.util.Scanner;


public class Exercicio1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //instanciando objs
        Triangulo x = new Triangulo();
        Triangulo y = new Triangulo();

        //declarando variaveis
        Double areaX,areaY;


        System.out.println("digite os tres valores de x:");
        x.a = scan.nextDouble();
        x.b = scan.nextDouble();
        x.c = scan.nextDouble();
        
        System.out.println("digite os tres valores de y:");
        y.a = scan.nextDouble();
        y.b = scan.nextDouble();
        y.c = scan.nextDouble();

        
        areaX = x.area();
        System.out.printf("%na area do triangulo x: %.4f%n", areaX);
        
        areaY = y.area();
        System.out.printf("a area do triangulo y: %.4f%n", areaY);

        if(areaX > areaY){
        System.out.println("\no triangulo de x eh maior");
        }else{
            System.out.println("\no triangulo de y eh maior");
        }
    }
}

package application;

import entitites.Circle;
import entitites.Forma;
import entitites.Retangulo;
import entitites.enums.Color;

import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Forma> list = new ArrayList<>();


        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("Forma #" + i + "data: ");
            System.out.print("Rectangulo or Circle (r/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            if(ch == 'r'){
                System.out.print("Width: ");
                Double width = sc.nextDouble();
                System.out.print("Altura: ");
                Double altura = sc.nextDouble();
                list.add(new Retangulo(color,width,altura));
            }
            else{
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                list.add(new Circle(color,radius));

            }

        }

        System.out.println();
        System.out.println("FORMA AREAS:");
        for(Forma forma : list){
            System.out.println(String.format("%.2f",forma.area()));
        }

        sc.close();
    }
}

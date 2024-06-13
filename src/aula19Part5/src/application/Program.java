package application;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String stdPath = sc.nextLine();

        File path = new File(stdPath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS:");
        for(File folder : folders){
            System.out.println(folder);
        }

        System.out.println("\n----");

        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES: ");
        for(File file : files){
            System.out.println(file);
        }

        //Criando uma subpasta a partir da pasta "\temp"
        boolean success = new File(stdPath + "\\subdir").mkdir();
        System.out.println("Directory created sucessfully: "+success);
        sc.close();
    }
}

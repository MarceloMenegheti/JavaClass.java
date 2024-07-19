package application;

import entities.Employee;
import util.ProductServise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        System.out.print("Enter salary: ");
        Double salary = sc.nextDouble();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

           List<Employee> list = new ArrayList<>();

           String line = br.readLine();

           while(line != null){
               String[] fields = line.split(",");
               list.add(new Employee(fields[0],fields[1],Double.parseDouble(fields[2])));
               line = br.readLine();
           }

           List<String> emails = list.stream()
                   .filter(p -> p.getSalary() > salary)
                   .map(p -> p.getEmail())
                   .sorted()//para ordernar
                   .collect(Collectors.toList());

           System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary) + ":");
           emails.forEach(System.out::println);

           ProductServise ps = new ProductServise();

           //funcao mais flexivel
           double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'M');
           System.out.println("Sum of salary from people whose name starts with 'M': " + String.format("%.2f", sum));


        }catch (IOException e){
           System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}

package application;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
//import Entities.Product;

public class Program {
    public static void main(String[] args) {

        Set<String> set = new TreeSet<>();
        set.add("Tv");
        set.add("Tablet");
        set.add("Notebook");

        System.out.println(set.contains("Notebook"));

        for (String p : set) {
            System.out.println(p);
        }
    }
}
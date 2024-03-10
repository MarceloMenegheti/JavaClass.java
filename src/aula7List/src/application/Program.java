package application;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args){

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Leo");
        list.add("Dudu");
        list.add("Diego");

        list.add(2,"Marcelo");
        System.out.println(list.size());
        list.remove(1);
        list.removeIf(ler -> ler.charAt(0) == 'M');

        for(String ler : list){
            System.out.println(ler);
        }

        System.out.println("-----------");
        System.out.println("Index of Dudu: "+ list.indexOf("Dudu"));
        System.out.println("Index of Dudu: "+ list.indexOf("Diego"));
        System.out.println("-----------");

        list.add("Maria");
        list.add("Leo");
        list.add(2,"Marcelo");

        List<String> result = list.stream().filter(ler -> ler.charAt(0) == 'M').collect(Collectors.toList());
        for(String ler : result){
            System.out.println(ler);
        }

        System.out.println("-----------");
        String name = list.stream().filter(ler -> ler.charAt(0) == 'D').findFirst().orElse(null);
        System.out.println(name);
    }
}

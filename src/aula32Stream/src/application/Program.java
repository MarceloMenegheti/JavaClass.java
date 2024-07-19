package application;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(3,4,5,10,7);

        //como criar uma Stream através de uma lista
        Stream<Integer> st1 = list.stream().map(x -> x *10);
        System.out.println(Arrays.toString(st1.toArray()));

        //como criar uma Stream através do "of"
        Stream<String> st2 = Stream.of("Marcelo","Luiz","Diego","Vini");
        System.out.println(Arrays.toString(st2.toArray()));

    }
}

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

        //função de iteração
        Stream<Integer> st3 = Stream.iterate(0,x -> x + 2);//x que leva a x + 2
        System.out.println(Arrays.toString(st3.limit(10).toArray()));

        //Sequencia de fibonacci
        Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0] + p[1]}).map(p -> p[0]);
        System.out.println(Arrays.toString(st4.limit(10).toArray()));

    }
}

package application;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args){

        List<Integer> list = Arrays.asList(3,4,5,10,7);

        Stream<Integer> st1 = list.stream().map(x -> x * 10);//map() ação intermediária.
        System.out.println(Arrays.toString(st1.toArray()));//toArray ação terminal.


        //reduce e uma ação Terminal que pega um elemento inicial "0" e uma func dois elementos "(x,y)" que geram um resultado.
        int sum = list.stream().reduce(0, (x,y) -> x + y);
        System.out.println("Sum = " + sum);

        //pipeline maior
        List<Integer> newList = list.stream()
                .filter(x -> x % 2 == 0)//gerando um predicado.
                .map(x -> x * 10)//transforma cada elemento conforme na expressao lambda.
                .collect(Collectors.toList());//ação terminal.

        System.out.println(Arrays.toString(newList.toArray()));
    }
}

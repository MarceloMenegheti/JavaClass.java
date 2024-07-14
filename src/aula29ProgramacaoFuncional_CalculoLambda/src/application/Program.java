package application;
import entities.Product;

import java.util.List;
public class Program {
    public static int compareProducts(Product p1, Product p2) {
        return p1.getPrice().compareTo(p2.getPrice());
    }

    public static void main(String[] args) {
        (...)

        list.sort(Program::compareProducts);

        /* Em programação funcional, expressão lambda corresponde a uma
        função anônima de primeira classe*/
        list.sort((p1, p2) -> p1.getPrice().compareTo(p2.getPrice()));

        (...)
    }
}

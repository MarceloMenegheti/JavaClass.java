package util;

public class CurrencyConverter {

    public static double TAX = 0.06;// in porcent

    public static double quantityInReais(double price, double quantity){
        return price * quantity * (1.0 + TAX);
    }

}

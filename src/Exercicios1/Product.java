package Exercicios1;

public class Product{

    //atributos
    public String name;
    public Double price;
    public int quantity;


    //metodos
    public Double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity; 
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity; 
    }

    public String toString(){
        return name 
        + ", $ "
        + String.format("%.2f", price)
        + ", "
        + quantity
        +" Units, total: $ "
        + String.format("%.2f",totalValueInStock());
    }

}
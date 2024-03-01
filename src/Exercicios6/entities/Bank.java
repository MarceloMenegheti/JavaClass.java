package entities;

public class Bank {
    
    private int number;
    private String name;
    private double deposit = 0.00;
    private final double TAX = 5.00;

    public Bank(int number, String name, double initialDeposit){
        this.number = number;
        this.name = name;
        AddDeposit(initialDeposit);
    }

    //sobrecarga construtor
    public Bank(int number, String name){
        this.number = number;
        this.name = name;
    }    

    public int getNumber(){
        return number;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void AddDeposit(double deposit){
        this.deposit += deposit;
    }

    public void removeDeposit(double deposit){
        this.deposit = (this.deposit - deposit) - TAX;
    }

    public String toString(){
        return "Accont " 
        + number
        + ", Holder: "
        + name
        + ", Balence: $ "
        + String.format("%.2f",deposit);
    }
}

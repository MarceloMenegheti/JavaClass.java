package entities;

public class Account {
    private Integer number;
    private String holder;
    protected Double balence;

    public Account(){

    }

    public Account(Integer number, String holder, Double balence) {
        this.number = number;
        this.holder = holder;
        this.balence = balence;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalence() {
        return balence;
    }

    public void withDraw(double amount){
        balence -= amount;
    }

    public void deposit(double amount){
        balence += amount;
    }

}

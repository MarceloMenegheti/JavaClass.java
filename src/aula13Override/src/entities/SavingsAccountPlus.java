package entities;

public class SavingsAccountPlus extends SavingsAccount{
    @Override
    public void withDraw(double amount){
        balence -= amount + 4;
    }
}

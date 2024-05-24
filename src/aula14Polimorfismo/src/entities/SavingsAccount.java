package entities;

public class SavingsAccount extends Account{
    private Double interestRate;

    public SavingsAccount(){
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balence, Double interestRate) {
        super(number, holder, balence);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalence(){
        balence += balence * interestRate;
    }

    @Override
    public void withDraw(double amount){
        balence -= amount;
    }
}
package model.entities;

import model.exceptions.BusinessException;

public class Account {

    private Integer number;
    private String titular;
    private Double saldo;
    private Double withdrawLimit;


    public Account() {
    }

    public Account(Integer number, String titular, Double saldo, Double withdrawLimit) {
        super();
        this.number = number;
        this.titular = titular;
        this.saldo = saldo;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount){
        saldo += amount;
    }

    public void withdraw(double amount){
        validateWithdraw(amount);
        saldo -= amount;
    }

    private void validateWithdraw(double amount){
        if(amount > getWithdrawLimit()){
            throw new BusinessException("Error in balence: A quantia excede o limite de saque");
        }
        if (amount > getSaldo()){
            throw new BusinessException("Error in balence: Saldo insuficiente");
        }
    }

}
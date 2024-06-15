package model.entities;

public class Invoice {
    private Double basicalPayment;
    private Double tax;

    public Invoice(){

    }

    public Invoice(Double basicalPayment, Double tax) {
        this.basicalPayment = basicalPayment;
        this.tax = tax;
    }

    public Double getBasicalPayment() {
        return basicalPayment;
    }

    public void setBasicalPayment(Double basicalPayment) {
        this.basicalPayment = basicalPayment;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getTotalPayment(){
        return getBasicalPayment() + getTax();
    }

}

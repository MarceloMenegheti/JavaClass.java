package model.entities;

public class Product {
    private String name;
    private Double value;
    private Integer quantidade;

    public Product() {
    }

    public Product(String name, Double value, Integer quantidade) {
        super();
        this.name = name;
        this.value = value;
        this.quantidade = quantidade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public double valorFinal(){
        return quantidade*value;
    }
}

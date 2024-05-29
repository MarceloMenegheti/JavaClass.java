package entitites;

import entitites.enums.Color;
public class Retangulo extends Forma{
    private Double width;
    private Double altura;

    public Retangulo() {
        super();
    }

    public Retangulo(Color color,Double width, Double altura) {
        super(color);
        this.width = width;
        this.altura = altura;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public double area() {
        return width * altura;
    }
}

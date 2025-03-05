package Exerc_10;

public class Triangulo {
    private Double base;
    private Double altura;

    public Double calcularArea(Double base, Double altura){
        this.base = base;
        this.altura = altura;
        Double area = (base * altura) / 2;
        return area;
    }

}

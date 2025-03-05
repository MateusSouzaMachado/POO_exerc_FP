package Exerc_6;

public class Retangulo {
    private Double base;
    private Double altura;


    public Double calcularArea(Double base, Double altura){
        this.base = base;
        this.altura = altura;

        Double area = base * altura;

        return area;
    }
}

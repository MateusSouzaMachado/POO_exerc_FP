package Exerc_7;

public class Circulo {
    private Double raio;

    public Double calcularArea(Double raio){
        this.raio = raio;

        Double area = Math.PI * Math.pow(raio, 2);
        return area;
    }

    public Double calcularPerimetro(Double raio){
        this.raio = raio;

        Double perimetro = 2 * Math.PI * raio;
        return perimetro;

    }
}

package Exerc_8;

public class Bola {
    private String cor;
    private String material;
    private String diametro;
    
    public String informacoesBola(String cor, String material,String diametro){
        this.cor = cor;
        this.diametro = diametro;
        this.material = material;

        return String.format("cor: %s, diametro: %s material: %s", cor , diametro , material);
    }
}

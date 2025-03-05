package ep1_POO.exerc4;

import java.util.Scanner;

public class Carro {

    String modelo;
    String cor;
    int anoDeFabricacao = 0;
    int idadeCarro = 0;

    public void setFichaTecnicaCarro(){
        Scanner ler = new Scanner(System.in);


        System.out.println("Informe o modelo: ");
        this.modelo = ler.nextLine();
        System.out.println("Informe a cor");
        this.cor = ler.nextLine();
        System.out.println("Informe o ano de fabricação: ");
        this.anoDeFabricacao = ler.nextInt();


    }

    public void calcularIdadeCarro(){
        Scanner ler = new Scanner(System.in);
        int anoAtual;

        System.out.println("Informe o ano atual: ");
        anoAtual = ler.nextInt();

        this.idadeCarro = anoAtual - this.anoDeFabricacao;

    }

    public void getFichaTecnicaCarro(){

        System.out.println("Modelo: " + modelo
        + "\nCor: " + cor
        + "\nAno De Fabricação: " + anoDeFabricacao
        + "\nIdade Do Carro: " + idadeCarro);

    }


}

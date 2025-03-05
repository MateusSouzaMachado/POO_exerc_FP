package ep1_POO.exerc3;

import java.util.Scanner;

public class Musica {

    String titulo;
    String artista;
    int anoLancamento;
    float totalAvaliacoes = 0;
    float numAvaliacoes = 0;
    float mediaAvaliacoes = 0;

    public void setFichaTecnica(){
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o Artista:\n ");
        this.artista = ler.nextLine();
        System.out.println("Informe o Titulo:\n ");
        this.titulo = ler.nextLine();
        System.out.println("Informe o Ano de Lançamento:\n ");
        this.anoLancamento = ler.nextInt();
    }

    public void getFichaTecnica(){
        System.out.println("O Artista: " + this.artista +
                "\nO Titulo: " + this.titulo +
                "\nO Ano de Lançamento: " + this.anoLancamento +
                "\nMedia das Avaliações: " + this.mediaAvaliacoes );
    }

    public void setAvaliacoes(){
        Scanner  ler = new Scanner(System.in);
        float avaliacoes;

        do {
            System.out.println("Informe a sua avaliação: (0 a 5)");
            avaliacoes = ler.nextFloat();
            if (avaliacoes < 0 || avaliacoes > 5){
                System.out.println("De 0 a 5 deve ser a avaliação");
            }
        }while (avaliacoes < 0 || avaliacoes > 5);

        System.out.println("\nSua avaliação: " + avaliacoes);
        this.totalAvaliacoes += avaliacoes;
        this.numAvaliacoes++;

        this.mediaAvaliacoes = this.totalAvaliacoes / this.numAvaliacoes;

    }

}

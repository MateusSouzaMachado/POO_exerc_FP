package Exerc_9;

public class Livro {
    private int ANO_ATUAL = 2024;
    private String titulo;
    private String autor;
    private int paginas;
    private int anoPublicao;

    public Livro(String titulo, String autor, int paginas, int anoPublicao){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.anoPublicao = anoPublicao;
    }

    public String livroInformacoes(){
        return String.format("Titulo: %s \n Autor: %s \n Paginas: %d \nAno Publicação: %d ", titulo, autor, paginas, anoPublicao);
    }

    public int numerosDePaginas(){
        int quantidadePaginas = 0;
        if (anoPublicao < ANO_ATUAL) {
        while (anoPublicao < ANO_ATUAL){
            anoPublicao++;
            quantidadePaginas +=  paginas;
        }
        return quantidadePaginas;
        }else{
            return paginas;
        }       
    }

}

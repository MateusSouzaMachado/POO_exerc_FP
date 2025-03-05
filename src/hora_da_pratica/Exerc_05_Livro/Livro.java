package hora_da_pratica.Exerc_05_Livro;
public class Livro {

    private String autor;
    private String titulo;
    
    public Livro(String autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

   public String exibirDetalhes(){
     return String.format("Autor: %s.%nTitulo: %s.%n", autor,titulo);
   }
}

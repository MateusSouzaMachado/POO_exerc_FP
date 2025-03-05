package ep1_POO.exerc5;

public class AlunoPOO {

    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String exibirDetalhes(){
        return String.format("Aluno: %s \nIdade: %d", nome, idade);
    }
}

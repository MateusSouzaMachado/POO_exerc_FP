package hora_da_pratica.Exerc_02_IdadePessoa;

public class IdadePessoa {

    private String nome;
    private int idade;
    private int MAIORIDADE = 18;

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

    public String verificarIdade(){

        if (MAIORIDADE > idade) {
             
             return String.format("Você é menor de idade. \nidade: %d", idade);
        }else{
            
            return String.format("Você é maior de idade. \nidade: %d", idade);
        }
    }

    
}

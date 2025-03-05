package hora_da_pratica.Exerc_04_Aluno;

public class Aluno {

    private String nome;
    private Double[] notas;

    public Aluno(String nome, Double[] notas){
        this.nome = nome;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double[] getNotas() {
        return notas;
    }
    public void setNotas(Double[] notas) {
        this.notas = notas;
    }

    public Double calcularMedia(){

        if (notas.length == 0 || notas == null) {
            throw new IllegalArgumentException("O aluno não possui notas cadastradas.");
        }

        Double soma = 0.0;
        for(Double nota : notas){
            soma += nota;
        }
        return soma / notas.length;

    }

    

}

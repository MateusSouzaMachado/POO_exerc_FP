package hora_da_pratica.Exerc_03_Produto;

public class Produto {

    private String nome;
    private Double preco;

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(Double percentual){
        if (percentual < 0 || 100 < percentual) {
            throw new IllegalArgumentException("A porcentagem deve ser de 0 a 100");
        }
        
        Double desconto = preco * (percentual / 100);
        preco -= desconto;

        System.out.printf("Desconto de %.2f%%.%npreço novo: %.2f.%n",percentual,preco);
    } 


    

}

package hora_da_pratica.Exerc_03_Produto;

public class App {
public static void main(String[] args) {

    Produto p1 = new Produto("pão",100.00);
    try {
        p1.aplicarDesconto(5.00); // Percentual inválido
    } catch (IllegalArgumentException e) {
        System.out.println("Erro ao aplicar desconto: " + e.getMessage());
    }
    try {
        p1.aplicarDesconto(5.00); // Percentual inválido
    } catch (IllegalArgumentException e) {
        System.out.println("Erro ao aplicar desconto: " + e.getMessage());
    }
    p1.getPreco();
}
}

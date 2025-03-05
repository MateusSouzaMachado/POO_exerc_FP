package Exerc_9;

public class Main {
public static void main(String[] args) {
    

    Livro l1 = new Livro("percy jackson", "Rick Riordan", 
    416, 2005);

    System.out.println(l1.livroInformacoes() + "\n" + l1.numerosDePaginas());
}
}

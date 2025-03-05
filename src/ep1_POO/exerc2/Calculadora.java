package ep1_POO.exerc2;

import java.util.Scanner;

public class Calculadora {

    int numero = 0;

    public void informarNumero(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        numero = ler.nextInt();
        numero *= 2;
    }

    public void getNumero() {
        System.out.println("O dobro do seu numero é esse: " + numero);
    }
}

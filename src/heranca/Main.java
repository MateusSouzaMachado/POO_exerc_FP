package heranca;

import heranca.Veiculo.Carro;
import heranca.Veiculo.Moto;
import heranca.Veiculo.Onibus;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Moto moto1 = new Moto();
        Onibus onibus1 = new Onibus();

        moto1.ligar();
        moto1.desligar();
        carro1.ligar();
        carro1.desligar();
        onibus1.ligar();
        onibus1.desligar();

    }
}

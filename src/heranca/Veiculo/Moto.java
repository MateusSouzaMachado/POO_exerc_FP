package heranca.Veiculo;

public class Moto extends Veiculo{

    @Override
    public void ligar() {
        System.out.println("Ligando o carro");
    }

    @Override
    public void desligar() {
        System.out.println("Moto desligada");
    }
}

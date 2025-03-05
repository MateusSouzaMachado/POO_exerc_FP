package heranca.Veiculo;

public class Onibus extends Veiculo{

    @Override
    public void ligar() {
        System.out.println("Ligando o ônibus");
    }

    @Override
    public void desligar() {
        System.out.println("Ônibus desligado");
    }
}

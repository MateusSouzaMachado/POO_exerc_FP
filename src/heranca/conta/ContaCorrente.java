package heranca.conta;

public class ContaCorrente extends ContaBancaria{



    @Override
    public void depositar(double valor) {
        this.setSaldo(this.getSaldo() + valor);
    }

    @Override
    public void sacar(double valor) {
        if (this.getSaldo() > valor) {
            this.setSaldo(this.getSaldo() - valor);
        }else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public double consultarSaldo() {
        return this.getSaldo();
    }

    public void cobrarTarifaMensal(double valor){
        this.setSaldo(this.getSaldo() - (this.getSaldo() * (valor / 100)));
    }
}

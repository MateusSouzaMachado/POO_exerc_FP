package inter.ConversoMoeda;

public class ConversoMoeda implements ConversaoFinanceira {
    @Override
    public double converteDolarParaReal(double valor) {
        double real = valor * 5.44;
        return real;
    }
}

package pattern.impostos;

public class ImpostoReduzido implements Imposto{

    @Override
    public double calcular(double valor) {
        return valor * 0.05;
    }

}
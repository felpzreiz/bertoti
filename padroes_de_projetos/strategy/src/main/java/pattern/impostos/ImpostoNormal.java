package pattern.impostos;

public class ImpostoNormal implements Imposto{

    @Override
    public double calcular(double valor) {
        return valor * 0.10;
    }

}

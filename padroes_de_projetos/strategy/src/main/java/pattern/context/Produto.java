package pattern.context;

import pattern.impostos.Imposto;

public class Produto {
    private String nome;
    private double preco;
    private Imposto imposto;

    public Produto(String nome, double preco, Imposto imposto) {
        this.nome = nome;
        this.preco = preco;
        this.imposto = imposto;
    }

    public double calcularImposto() {
        return imposto.calcular(preco);
    }

    public void setImposto(Imposto imposto) {
        this.imposto = imposto;
    }
}
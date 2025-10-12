package antipattern;

public class Produto {
    private String nome;
    private double preco;
    private String tipoImposto;

    public Produto(String nome, double preco, String tipoImposto) {
        this.nome = nome;
        this.preco = preco;
        this.tipoImposto = tipoImposto;
    }

    public double calcularImposto() {
        if (tipoImposto.equals("NORMAL")) {
            return preco * 0.10;
        } else if (tipoImposto.equals("REDUZIDO")) {
            return preco * 0.05;
        } else {
            throw new IllegalArgumentException("Tipo de imposto inválido!");
        }
    }
}

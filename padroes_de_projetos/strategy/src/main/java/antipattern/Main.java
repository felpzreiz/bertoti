package antipattern;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Produto A", 100, "NORMAL");
        Produto p2 = new Produto("Produto B", 100, "REDUZIDO");

        System.out.println("Imposto Produto A: " + p1.calcularImposto());
        System.out.println("Imposto Produto B: " + p2.calcularImposto());
    }
}
package pattern;

import pattern.context.Produto;
import pattern.impostos.ImpostoNormal;
import pattern.impostos.ImpostoReduzido;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Produto A", 100, new ImpostoNormal());
        Produto p2 = new Produto("Produto B", 100, new ImpostoReduzido());

        System.out.println("Imposto Produto A: " + p1.calcularImposto());
        System.out.println("Imposto Produto B: " + p2.calcularImposto());

        p1.setImposto(new ImpostoReduzido());
        System.out.println("Imposto Produto A após mudança: " + p1.calcularImposto());
    }
}
package pattern.strategy;

public class Renderizacao2D implements Renderizacao {
    public void renderizar(String nome) {
        System.out.println("Renderizando " + nome + " em 2D.");
    }
}
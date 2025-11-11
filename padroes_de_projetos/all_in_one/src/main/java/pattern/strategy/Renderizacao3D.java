package pattern.strategy;

public class Renderizacao3D implements Renderizacao {
    public void renderizar(String nome) {
        System.out.println("Renderizando " + nome + " em 3D.");
    }
}
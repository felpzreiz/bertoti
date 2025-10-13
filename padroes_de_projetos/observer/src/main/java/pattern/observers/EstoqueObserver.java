package pattern.observers;

import pattern.subjects.Pedido;

public class EstoqueObserver implements Observer {
    @Override
    public void update(Pedido pedido) {
        System.out.println("Atualizando estoque para o pedido de " + pedido.getCliente());
    }
}

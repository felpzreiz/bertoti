package pattern.observers;

import pattern.subjects.Pedido;

public class FinanceiroObserver implements Observer {
    @Override
    public void update(Pedido pedido) {
        System.out.println("Registrando pedido de " + pedido.getCliente() + " no financeiro");
    }
}
package pattern.observers;

import pattern.subjects.Pedido;

public class EmailObserver implements Observer {
    @Override
    public void update(Pedido pedido) {
        System.out.println("Enviando e-mail para o cliente " + pedido.getCliente());
    }
}
package pattern;

import pattern.observers.EmailObserver;
import pattern.observers.EstoqueObserver;
import pattern.observers.FinanceiroObserver;
import pattern.subjects.Pedido;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido("123", "Felipe Reis de Brito", 250.00);

        pedido.adicionarObserver(new EmailObserver());
        pedido.adicionarObserver(new EstoqueObserver());
        pedido.adicionarObserver(new FinanceiroObserver());

        pedido.confirmar();
    }
}
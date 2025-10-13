package pattern.subjects;

import pattern.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class PedidoSubject {
    private List<Observer> observers = new ArrayList<>();

    public void adicionarObserver(Observer observer) {
        observers.add(observer);
    }

    public void removerObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notificarObservers(Pedido pedido) {
        for (Observer o : observers) {
            o.update(pedido);
        }
    }
}
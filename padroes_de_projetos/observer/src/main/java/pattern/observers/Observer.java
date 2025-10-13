package pattern.observers;

import pattern.subjects.Pedido;

public interface Observer {
    void update(Pedido pedido);
}
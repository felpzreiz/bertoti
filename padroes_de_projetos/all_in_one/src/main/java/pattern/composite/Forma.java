package pattern.composite;

import pattern.observer.Observer;

public interface Forma {
    void renderizar();
    void adicionarObservador(Observer obs);
}
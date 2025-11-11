package pattern.composite;

import pattern.observer.Observer;
import pattern.strategy.Renderizacao;

import java.util.ArrayList;
import java.util.List;

public class Circulo implements Forma {
    private String nome;
    private Renderizacao estrategia;
    private List<Observer> observadores = new ArrayList<>();

    public Circulo(String nome, Renderizacao estrategia) {
        this.nome = nome;
        this.estrategia = estrategia;
    }

    @Override
    public void renderizar() {
        estrategia.renderizar(nome);
        notificar("Renderizado: " + nome);
    }

    public void adicionarObservador(Observer obs) {
        observadores.add(obs);
    }

    private void notificar(String msg) {
        for (Observer o : observadores) o.atualizar(msg);
    }
}
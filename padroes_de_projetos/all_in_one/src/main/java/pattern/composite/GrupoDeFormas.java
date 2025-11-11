package pattern.composite;

import pattern.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class GrupoDeFormas implements Forma {
    private String nome;
    private List<Forma> formas = new ArrayList<>();

    public GrupoDeFormas(String nome) {
        this.nome = nome;
    }

    public void adicionar(Forma forma) {
        formas.add(forma);
    }

    @Override
    public void renderizar() {
        System.out.println("Renderizando grupo: " + nome);
        for (Forma f : formas) f.renderizar();
    }

    public void adicionarObservador(Observer obs) {
        for (Forma f : formas) f.adicionarObservador(obs);
    }
}
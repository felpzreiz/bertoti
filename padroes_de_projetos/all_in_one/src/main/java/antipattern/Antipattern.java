package antipattern;

import java.util.ArrayList;
import java.util.List;

public class Antipattern {
    private String tipo;
    private String nome;
    private String modoRenderizacao;
    private List<Antipattern> filhos = new ArrayList<>();

    public Antipattern(String tipo, String nome, String modoRenderizacao) {
        this.tipo = tipo;
        this.nome = nome;
        this.modoRenderizacao = modoRenderizacao;
    }

    public void adicionar(Antipattern f) {
        filhos.add(f);
    }

    public void renderizar() {
        System.out.println("[" + modoRenderizacao + "] Renderizando " + tipo + " " + nome);
        for (Antipattern f : filhos) {
            f.renderizar();
        }
        System.out.println("(Notificação enviada: " + nome + ")");
    }

    public static void main(String[] args) {
        Antipattern principal = new Antipattern("Grupo", "Principal", "2D");
        Antipattern circulo = new Antipattern("Círculo", "Vermelho", "3D");
        principal.adicionar(circulo);
        principal.renderizar();
    }
}

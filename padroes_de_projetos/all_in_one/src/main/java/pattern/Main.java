package pattern;

import pattern.composite.Circulo;
import pattern.composite.GrupoDeFormas;
import pattern.strategy.Renderizacao;
import pattern.strategy.Renderizacao2D;
import pattern.strategy.Renderizacao3D;
import pattern.observer.Logger;

public class Main {
    public static void main(String[] args) {
        Renderizacao render2D = new Renderizacao2D();
        Renderizacao render3D = new Renderizacao3D();

        Circulo c1 = new Circulo("Círculo Vermelho", render2D);
        Circulo c2 = new Circulo("Círculo Azul", render3D);
        GrupoDeFormas grupo = new GrupoDeFormas("Grupo Principal");

        grupo.adicionar(c1);
        grupo.adicionar(c2);

        Logger logger = new Logger();
        grupo.adicionarObservador(logger);

        grupo.renderizar();
    }
}
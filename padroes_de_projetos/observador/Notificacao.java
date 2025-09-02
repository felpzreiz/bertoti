import java.util.LinkedList;

public class Notificacao {
    private double temperatura;
    private double umidade;
    private double pressao;

    private List<Observador> observadores = new LinkedList<>();

    public void addObservadores(Observador o){
        observadores.add(o);
    }

    public void notificar(){
        for(Observador observador:observadores){
            observador.atualizar(temperatura, umidade, pressao);
        }
    }
}

package pattern.observer;

public class Logger implements Observer {
    @Override
    public void atualizar(String mensagem) {
        System.out.println("[LOG]: " + mensagem);
    }
}
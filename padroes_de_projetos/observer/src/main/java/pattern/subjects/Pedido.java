package pattern.subjects;

public class Pedido extends PedidoSubject {
    private String id;
    private String cliente;
    private double valor;
    private boolean confirmado = false;

    public Pedido(String id, String cliente, double valor) {
        this.id = id;
        this.cliente = cliente;
        this.valor = valor;
    }

    public void confirmar() {
        this.confirmado = true;
        System.out.println("Pedido confirmado: " + id);
        notificarObservers(this);
    }

    public String getCliente() {
        return cliente;
    }

    public double getValor() {
        return valor;
    }
}
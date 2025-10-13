package antipattern;

public class Pedido {
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

        enviarEmail();
        atualizarEstoque();
        registrarFinanceiro();
    }

    private void enviarEmail() {
        System.out.println("Enviando e-mail para o cliente " + cliente);
    }

    private void atualizarEstoque() {
        System.out.println("Atualizando estoque para o pedido de " + cliente);
    }

    private void registrarFinanceiro() {
        System.out.println("Registrando pedido de " + cliente + " no financeiro");
    }
}
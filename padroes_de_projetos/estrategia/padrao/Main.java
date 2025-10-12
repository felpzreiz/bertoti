package padrao;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente(
                "Felipe",
                "123.456.789-00",
                "felipe@email.com",
                "99999-9999",
                0.0
        );

        cliente.setEmprestimoPermission(false);

        cliente.emprestar(1000.0);
        cliente.emprestar(500.0);
        cliente.emprestar(-200.0);
    }
}
package antipadrao;

import padrao.Cliente;

public class Main {
    public static void main(String[] args) {

        padrao.Cliente cliente = new Cliente(
                "Felipe",
                "123.456.789-00",
                "felipe@email.com",
                "99999-9999",
                0.0
        );

        cliente.setEmprestimoPermission(true);

        cliente.emprestar(1000.0);
        cliente.emprestar(500.0);
        cliente.emprestar(-200.0);
    }
}
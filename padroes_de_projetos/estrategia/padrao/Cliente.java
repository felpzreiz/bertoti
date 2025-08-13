package padrao;

public class Cliente implements Emprestimo {
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private Double saldo;

    public String getNome() {
        return nome;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Cliente(String nome, String cpf, String email, String telefone, Double saldoInicial) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.saldo = saldoInicial;
    }

    @Override
    public void emprestar(Double valor) {
        if (valor != null && valor > 0) {
            this.saldo += valor;
            System.out.println(nome + " pegou um empréstimo de R$ " + valor + ". Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Valor de empréstimo inválido!");
        }
    }
}

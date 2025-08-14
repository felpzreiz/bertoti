package antipadrao;

public class Cliente extends Emprestimo{
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private Double saldo;
    private Boolean emprestimoPermission;

    public Boolean getEmprestimoPermission() {
        return emprestimoPermission;
    }

    public void setEmprestimoPermission(Boolean emprestimoPermission) {
        this.emprestimoPermission = emprestimoPermission;
    }

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

    public void emprestar(Double valor) {
        if (emprestimoPermission) {
            if (valor != null && valor > 0) {
                this.saldo += valor;
                System.out.println(nome + " pegou um empréstimo de R$ " + valor + ". Saldo atual: R$ " + saldo);
            } else {
                System.out.println("Valor de empréstimo inválido!");
            }
        }else{
            System.out.println("O cliente " + nome + " não possui permissão para emprestar!");
        }
    }
}

public class Proprietario extends Pessoa {

    private String conta;
    private String agencia;

    public Proprietario(String nome, String telefone, String endereco, String cpf, String conta, String agencia) {
        super(nome, telefone, endereco, cpf);
        this.conta = conta;
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
}

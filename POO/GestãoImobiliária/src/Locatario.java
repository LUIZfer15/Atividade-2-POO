import java.util.ArrayList;
import java.util.List;

public class Locatario extends Pessoa {
    // Atributos
    private String email;
    private String salario;
    private List<Locacao> locacao;

    public Locatario(String nome, String telefone, String endereco, String cpf, String email, String salario) {
        super(nome, telefone, endereco, cpf);
        this.email = email;
        this.salario = salario;
        this.locacao = new ArrayList<Locacao>();
    }

    // Metodo de acesso
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

}

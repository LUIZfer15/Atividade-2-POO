import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Corretor extends Pessoa implements ReceberValor {
    // Atributos
    private String registro;
    private Date dataAdmissao;
    private double comissao;
    private double totalComissaoAcumulada;
    private List<Locacao> locacao;

    public Corretor(String nome, String telefone, String endereco, String cpf, String conta, String agencia,
            String registro, Date dataAdmissao, double comissao, double totalComissaoAcumulada) {
        super(nome, telefone, endereco, cpf);
        this.registro = registro;
        this.dataAdmissao = dataAdmissao;
        this.comissao = comissao;
        this.totalComissaoAcumulada = totalComissaoAcumulada;
        this.locacao = new ArrayList<Locacao>();

    }

    // Metodo de acesso
    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getTotalComissaoAcumulada() {
        return totalComissaoAcumulada;
    }

    public void getTotalComissaoAcumuladata(double totalComissaoAcumulada) {
        this.totalComissaoAcumulada = totalComissaoAcumulada;
    }

    @Override
    public void receber(double valor) {

    }

    public void sacarComissoes(double valor) {

    }

}

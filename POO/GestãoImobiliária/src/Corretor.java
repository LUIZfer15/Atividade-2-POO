import java.util.Date;

public class Corretor extends Pessoa {

    private String registro;
    private Date dataAdmissao;
    private double comissao;
    private double totalComissaoAcumulada;

    public Corretor(String nome, String telefone, String endereco, String cpf, String conta, String agencia,
            String registro, Date dataAdmissao, double comissao, double totalComissaoAcumulada) {
        super(nome, telefone, endereco, cpf);
        this.registro = registro;
        this.dataAdmissao = dataAdmissao;
        this.comissao = comissao;
        this.totalComissaoAcumulada = totalComissaoAcumulada;

    }

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

}

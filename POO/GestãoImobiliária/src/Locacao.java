import java.util.Date;

public class Locacao {
    // Atributos
    private Date dataInicio;
    private Date dataTerminio;
    private Date dataPagamento;
    private Corretor corretor;
    private Imovel imovel;
    private Locatario locatario;

    public Locacao(Date dataInicio, Date dataTerminio, Date dataPagamento, Corretor corretor, Imovel imovel,
            Locatario locatario) {
        this.dataInicio = dataInicio;
        this.dataTerminio = dataTerminio;
        this.dataPagamento = dataPagamento;
        this.corretor = corretor;
        this.imovel = imovel;
        this.locatario = locatario;
    }

    // Metodo de acesso
    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataTerminio() {
        return dataTerminio;
    }

    public void setDataTerminio(Date dataTerminio) {
        this.dataTerminio = dataTerminio;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    // Associação
    public Corretor getCorretor() {
        return corretor;
    }

    public void setCorretor(Corretor corretor) {
        this.corretor = corretor;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    public Locatario getLocatario() {
        return locatario;
    }

    public void setLocatario(Locatario locatario) {
        this.locatario = locatario;
    }

    public void enviarCobranca() {

    }

    public void pagarProprietario() {

    }

}

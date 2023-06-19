import java.util.Date;

public class Locacao {

    private Date dataInicio;
    private Date dataTerminio;
    private Date dataPagamento;

    public Locacao(Date dataInicio, Date dataTerminio, Date dataPagamento) {
        this.dataInicio = dataInicio;
        this.dataTerminio = dataTerminio;
        this.dataPagamento = dataPagamento;
    }

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

}

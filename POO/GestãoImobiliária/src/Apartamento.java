public class Apartamento {

    private int andar;
    private int numero;
    private double condominio;
    private double fundoReserva;
    private double investimentos;

    public Apartamento(int andar, int numero, double condominio, double fundoReserva, double investimentos) {
        this.andar = andar;
        this.numero = numero;
        this.condominio = condominio;
        this.fundoReserva = fundoReserva;
        this.investimentos = investimentos;

    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getCondomio() {
        return condominio;
    }

    public void setCondominio(double condominio) {
        this.condominio = condominio;
    }

    public double getfundoReserva() {
        return fundoReserva;
    }

    public void setFundoReserva(double fundoReserva) {
        this.fundoReserva = fundoReserva;
    }

    public double getInvestimentos() {
        return investimentos;
    }

    public void setInvestimentos(double investimentos) {
        this.investimentos = investimentos;
    }

}

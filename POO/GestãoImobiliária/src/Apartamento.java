public class Apartamento extends Imovel {
    // Atributos
    private int andar;
    private int numero;
    private double condominio;
    private double fundoReserva;
    private double investimentos;

    public Apartamento(int codigo, String endereco, double valorLocacao, int vagasGaragem, int quartos, int banheiros,
            int andar, int numero, double condominio, double fundoReserva, double investimentos) {
        super(codigo, endereco, valorLocacao, vagasGaragem, quartos, banheiros);
        this.andar = andar;
        this.numero = numero;
        this.condominio = condominio;
        this.fundoReserva = fundoReserva;
        this.investimentos = investimentos;

    }

    // Metodo de acesso
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

    public double calcularAluguel() {
        return 1.0;
    }

}

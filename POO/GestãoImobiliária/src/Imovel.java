import java.util.ArrayList;
import java.util.List;

public abstract class Imovel {
    // Atributos
    private int codigo;
    private String endereco;
    private double valorLocacao;
    private int vagasGaragem;
    private int quartos;
    private int banheiros;
    private List<Locacao> locacao;
    private Proprietario proprietario;

    public Imovel(int codigo, String endereco, double valorLocacao, int vagasGaragem, int quartos, int banheiros,
            List locacao, Proprietario proprietario) {
        this.codigo = codigo;
        this.endereco = endereco;
        this.valorLocacao = valorLocacao;
        this.vagasGaragem = vagasGaragem;
        this.quartos = quartos;
        this.banheiros = banheiros;
        this.locacao = new ArrayList<Locacao>();
        this.proprietario = proprietario;
    }

    // Metodo de acesso
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public int getVagasGaragem() {
        return vagasGaragem;
    }

    public void setVagasGaragem(int vagasGaragem) {
        this.vagasGaragem = vagasGaragem;
    }

    public int getQuartos() {
        return quartos;
    }

    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }

    public int getBanheiros() {
        return banheiros;
    }

    public void setBanheiros(int banheiros) {
        this.banheiros = banheiros;

    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;

    }

    abstract double calcularAluguel();

}

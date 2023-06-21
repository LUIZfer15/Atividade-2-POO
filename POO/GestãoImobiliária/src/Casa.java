public class Casa extends Imovel {
    // Atributo
    private int qtdadeAndares;

    public Casa(int codigo, String endereco, double valorLocacao, int vagasGaragem, int quartos, int banheiros,
            int qtdadeAndares) {
        super(codigo, endereco, valorLocacao, vagasGaragem, quartos, banheiros);
        this.qtdadeAndares = qtdadeAndares;
    }

    // Metodo de acesso
    public int getQtdadeAndares() {
        return qtdadeAndares;
    }

    public void setQtdadeAndares(int qtdadeAndares) {
        this.qtdadeAndares = qtdadeAndares;
    }

    @Override
    public double calcularAluguel() {
        return calcularAluguel();

    }

}

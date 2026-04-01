public class Banho extends Servico {
    private TamanhoPelo tamanhoPelo;

    public Banho(String cod, String data, TamanhoAnimal tAnim, TamanhoPelo tPelo) {
        super(cod, data, tAnim);
        this.tamanhoPelo = tPelo;
    }

    @Override
    public double calcularPreco() {
        return tamanhoAnimal.precoBaseBanho + tamanhoPelo.adicional;
    }

    @Override
    public String getDetalhes() {
        return String.format("[Banho] Cod: %s | Porte: %s | Pelo: %s | Valor: R$ %.2f",
                codigo, tamanhoAnimal, tamanhoPelo, calcularPreco());
    }
}
public class Tosa extends Servico {
    public Tosa(String cod, String data, TamanhoAnimal tAnim) {
        super(cod, data, tAnim);
    }

    @Override
    public double calcularPreco() {
        return tamanhoAnimal.precoTosa;
    }

    @Override
    public String getDetalhes() {
        return String.format("[Tosa ] Cod: %s | Porte: %s | Valor: R$ %.2f",
                codigo, tamanhoAnimal, calcularPreco());
    }
}
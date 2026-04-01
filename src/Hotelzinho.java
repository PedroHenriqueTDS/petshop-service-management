public class Hotelzinho extends Servico {
    private int horas;

    public Hotelzinho(String cod, String data, TamanhoAnimal tAnim, int horas) {
        super(cod, data, tAnim);
        this.horas = horas;
    }

    @Override
    public double calcularPreco() {
        return tamanhoAnimal.precoHoraHotel * horas;
    }

    @Override
    public String getDetalhes() {
        return String.format("[Hotel] Cod: %s | Porte: %s | Tempo: %dh | Valor: R$ %.2f",
                codigo, tamanhoAnimal, horas, calcularPreco());
    }
}
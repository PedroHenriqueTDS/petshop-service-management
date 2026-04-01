public enum TamanhoAnimal {
    PEQUENO(12.0, 30.0, 50.0),
    MEDIO(18.0, 40.0, 60.0),
    GRANDE(25.0, 50.0, 70.0);

    final double precoHoraHotel;
    final double precoTosa;
    final double precoBaseBanho;

    TamanhoAnimal(double hotel, double tosa, double banho) {
        this.precoHoraHotel = hotel;
        this.precoTosa = tosa;
        this.precoBaseBanho = banho;
    }
}
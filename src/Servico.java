public abstract class Servico implements ServicoPet {
    protected String codigo;
    protected String data;
    protected TamanhoAnimal tamanhoAnimal;

    public Servico(String codigo, String data, TamanhoAnimal tamanho) {
        this.codigo = codigo;
        this.data = data;
        this.tamanhoAnimal = tamanho;
    }
}
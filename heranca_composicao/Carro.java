public class Carro {
    protected String placa;
    protected String tipo;

    public Carro(String placa, String tipo) {
        this.placa = placa;
        this.tipo = tipo;
    }

    public String getPlaca() {
        return this.placa;
    }

    public String getTipo() {
        return this.tipo;
    }
}
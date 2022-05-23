public class Locacao {
    private Carro carro;
    private String cpf;

    public Locacao(Carro carro, String cpf) {
        this.carro = carro;
        this.cpf = cpf;
    }

    public void iniciarLocacao() {
        System.out.println("Carro placa " + this.carro.getPlaca() + "locado para CPF " + cpf);
    }

    public void finalizarLocacao(int dias) {
        double valorLocacao;
        if (carro.getTipo().equals("economico")) {
            valorLocacao = 100 * dias;    
        } else {
            valorLocacao = 200 * dias;    
        }
        System.out.println("Carro placa " + this.carro.getPlaca() + "devolvido. Valor locação:" + valorLocacao);
    } 
}
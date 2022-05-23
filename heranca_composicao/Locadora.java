public class Locadora {
    public static void main(String[] args) {
        CarroEconomico carroEconomico = new CarroEconomico("XXX");
        Carro outroCarro = new Carro("YYY", "luxo");

        Locacao l1 = new Locacao(carroEconomico, "999999999");
        l1.iniciarLocacao();
        l1.finalizarLocacao(10);

        Locacao l2 = new Locacao(outroCarro, "97898790809");
        l2.iniciarLocacao();
        l2.finalizarLocacao(2);
    }
}
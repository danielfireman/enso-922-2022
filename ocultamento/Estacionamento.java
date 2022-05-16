import java.util.Collection;
import java.util.Hashtable;

public class Estacionamento {
    public Hashtable<String, Integer> vagas;

    public Estacionamento() {
        vagas = new Hashtable<String, Integer>();
    }

    public Collection<Integer> vagasOcupadas() {
        return vagas.values();
    }
     public static void main(String[] args) {
         EstacionamentoComOcultamento e = new EstacionamentoComOcultamento();
         System.out.println("Vagas ocupadas no momento incial: " + e.vagasOcupadas());

         e.estaciona("XXX-1234", 1);
         System.out.println("Vagas ocupadas depois do primeiro carro: " + e.vagasOcupadas());

     }
}
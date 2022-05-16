import java.util.Collection;
import java.util.Hashtable;

public class Estacionamento {
    private Hashtable<String, Integer> vagas;

    public Estacionamento(Hashtable<String, Integer> copiaVagas) {
        vagas = copiaVagas;
    }

    public void estaciona(String placa, int vaga) {
        vagas.put(placa, vaga);
    }

    public Collection<Integer> vagasOcupadas() {
        return vagas.values();
    }

    public static void main(String[] args) {
        Hashtable<String, Integer> vagas = new Hashtable<>();
        Estacionamento e = new Estacionamento(vagas);
        
        
        e.estaciona("XXX-1234", 1);
        System.out.println("Vagas ocupadas: " + e.vagasOcupadas());

        vagas.remove("XXX-1234");
        System.out.println("Vagas ocupadas 2: " + e.vagasOcupadas());

    }

}

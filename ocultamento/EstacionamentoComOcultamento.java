import java.util.Collection;
import java.util.Hashtable;

public class EstacionamentoComOcultamento {
    private Hashtable<String, Integer> vagas;

    public EstacionamentoComOcultamento() {
        vagas = new Hashtable<String, Integer>();
    }

    public void estaciona(String placa, int vaga) {
        vagas.put(placa, vaga);
    }

    public Collection<Integer> vagasOcupadas() {
        return vagas.values();
    }

    public void liberaVaga(String placa) {
        vagas.remove(placa);
    }

}

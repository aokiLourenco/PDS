import java.util.ArrayList;
import java.util.List;

public class BasicCamperService implements ICamperService {

    private List<ICamper> camper = new ArrayList<>();

    @Override
    public void registaUtilizador(Utilizador u) {
    }

    @Override
    public ICamper registaCamper(int lugares, String descricao) {
        ICamper c = new Camper(lugares, descricao);
        camper.add(c);
        return c;
    }

    @Override
    public String registaAluguer(Cliente u, ICamper c) {
        if (c.getEstado() == Estado.Disponivel) {
            c.setEstado(Estado.Indisponivel);
            return u + c.getDescricao();
        }
        return "Utilizador " + u + " alugou " + c.getDescricao();
    }

    @Override
    public String terminaAluguer(Cliente u, ICamper c) {
        if (c.getEstado() == Estado.Indisponivel) {
            c.setEstado(Estado.Disponivel);
            return u + c.getDescricao();
        }
        return "Utilizador " + u + " devolveu " + c.getDescricao();
    }

    public List<ICamper> getCampersDisponiveis() {
        List<ICamper> c = new ArrayList<>();
        for (ICamper camper : camper) {
            if (camper.getEstado() == Estado.Disponivel) {
                c.add(camper);
            }
        }
        return c;
    }
    
}

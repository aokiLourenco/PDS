public class Camper implements ICamper {

    private Estado estado; 
    private int lugares;
    private String descricao;

    @Override
    public void setEstado(Estado e) {
        this.estado = e;
    }

    @Override
    public Estado getEstado() {
        return this.estado;
    }

    @Override
    public int getLugares() {
        return lugares;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    public Camper(int lugares, String descricao) {
        this.lugares = lugares;
        this.descricao = descricao;
        this.estado = Estado.Disponivel;
    }
    
    @Override
    public String toString() {
        return descricao;
    }
}

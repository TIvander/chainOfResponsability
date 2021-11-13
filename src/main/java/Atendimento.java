public class Atendimento {
    private TipoAtendimento tipoAtendimento;

    public Atendimento(TipoAtendimento tipoAtendimento){
        this.tipoAtendimento = tipoAtendimento;
    }

    public TipoAtendimento getTipoAtendimento(){
        return this.tipoAtendimento;
    }

    public void setTipoAtendimento(TipoAtendimento tipoAtendimento){
       this.tipoAtendimento = tipoAtendimento;
    }
}

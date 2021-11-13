import java.util.ArrayList;

public abstract class Atendente {
    protected ArrayList atendimentoPorAtendente = new ArrayList();
    private Atendente atendenteCorrespondente;

    public Atendente getAtendenteCorrespondente(){
        return atendenteCorrespondente;
    }

    public void setAtendenteCorrespondente(Atendente atendenteCorrespondente) {
        this.atendenteCorrespondente = atendenteCorrespondente;
    }

    public abstract String getTipoAtendimentoPorAtendente();

    public String realizarAtendimento(Atendimento atendimento) {
      if(atendimentoPorAtendente.contains(atendimento.getTipoAtendimento())) {
          return  getTipoAtendimentoPorAtendente();
      } else {
          if (atendenteCorrespondente != null) {
              return atendenteCorrespondente.realizarAtendimento(atendimento);
          } else {
              return "Atendimento Indisponível";
          }
      }
    }

}

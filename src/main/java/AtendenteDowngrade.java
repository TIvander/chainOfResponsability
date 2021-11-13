public class AtendenteDowngrade extends Atendente{

    public AtendenteDowngrade(Atendente atendenteCorrespondente) {
        atendimentoPorAtendente.add(Downgrade.getDowngrade());
        setAtendenteCorrespondente(atendenteCorrespondente);
    }

    @Override
    public String getTipoAtendimentoPorAtendente() {
        return "Atendimentos relacionados a Downgrade de planos";
    }

}

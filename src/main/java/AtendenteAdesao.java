public class AtendenteAdesao extends Atendente{

    public AtendenteAdesao(Atendente atendenteCorrespondente) {
        atendimentoPorAtendente.add(Aderir.getAderir());
        setAtendenteCorrespondente(atendenteCorrespondente);
    }
    @Override
    public String getTipoAtendimentoPorAtendente() {
        return "Atendimento relacionado a adesão de planos";
    }
}

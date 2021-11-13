public class AtendenteCancelamento extends Atendente{

    public AtendenteCancelamento(Atendente atendenteCorrespondente) {
        atendimentoPorAtendente.add(Cancelar.getCancelar());
        setAtendenteCorrespondente(atendenteCorrespondente);
    }
    @Override
    public String getTipoAtendimentoPorAtendente() {
        return "Atendimentos relacionados a cancelamentos de planos";
    }
}

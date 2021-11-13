public class Cancelar implements TipoAtendimento {
    private static Cancelar cancelar = new Cancelar();

    private Cancelar(){};

    public static Cancelar getCancelar() {
        return cancelar;
    }

    @Override
    public String tipoAtendimentoRealizado() {
        return "Cancelamento";
    }
}

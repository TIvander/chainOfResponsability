public class Aderir implements TipoAtendimento{

    private static Aderir aderir = new Aderir();

    private Aderir(){};

    public static Aderir getAderir() {
        return aderir;
    }

    @Override
    public String tipoAtendimentoRealizado() {
        return "Adesão";
    }
}

public class Downgrade implements TipoAtendimento{
    private static Downgrade downgrade = new Downgrade();

    private Downgrade(){
    };

    public static Downgrade getDowngrade() {
        return downgrade;
    }

    @Override
    public String tipoAtendimentoRealizado() {
        return "Downgrade";
    }
}

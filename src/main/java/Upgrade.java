public class Upgrade implements  TipoAtendimento{

    private static Upgrade upgrade = new Upgrade();

    private Upgrade(){};

    public static Upgrade getUpgrade() {
        return upgrade;
    }

    @Override
    public String tipoAtendimentoRealizado() {
        return "Upgrade";
    }
}

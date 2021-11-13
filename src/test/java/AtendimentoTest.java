import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtendimentoTest {

    AtendenteCancelamento atendenteCancelamento;
    AtendenteDowngrade atendenteDowngrade;
    AtendenteUpgrade atendenteUpgrade;
    AtendenteAdesao atendenteAdesao;
    @BeforeEach
    void setUp() {
        atendenteCancelamento = new AtendenteCancelamento(null);
        atendenteDowngrade = new AtendenteDowngrade(atendenteCancelamento);
        atendenteUpgrade = new AtendenteUpgrade(atendenteDowngrade);
        atendenteAdesao = new AtendenteAdesao(atendenteUpgrade);
    }

    @Test
    void deveRetornarAtendimentoIndisponivel() {
        Atendimento cancelamento = new Atendimento(Cancelar.getCancelar());
        atendenteCancelamento.atendimentoPorAtendente.remove(0);
        assertEquals("Atendimento Indisponível", atendenteCancelamento.realizarAtendimento(cancelamento));
    }

    @Test
    void deveRetornarAtendimentoAdesao() {
        assertEquals("Atendimento relacionado a adesão de planos", atendenteAdesao.realizarAtendimento(new Atendimento(Aderir.getAderir())));
    }

    @Test
    void deveRetornarAtendimentoUpgrade() {
        Atendimento upgrade = new Atendimento(Upgrade.getUpgrade());
        assertEquals("Atendimentos relacionados a Upgrade de planos", atendenteUpgrade.realizarAtendimento(upgrade));
    }

    @Test
    void deveRetornarAtendimentoDowngrade() {
        Atendimento downgrade = new Atendimento(Downgrade.getDowngrade());
        assertEquals("Atendimentos relacionados a Downgrade de planos", atendenteDowngrade.realizarAtendimento(downgrade));
    }

    @Test
    void deveRetornarAtendimentoCancelamento() {
        Atendimento cancelamento = new Atendimento(Cancelar.getCancelar());
        assertEquals("Atendimentos relacionados a cancelamentos de planos", atendenteCancelamento.realizarAtendimento(cancelamento));
    }


}
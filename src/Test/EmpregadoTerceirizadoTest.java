package Test;

import Empregado.EmpregadoTerceirizado;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmpregadoTerceirizadoTest {

    private EmpregadoTerceirizado empTerc;

    @BeforeEach
    private void instanciar() {
        empTerc = new EmpregadoTerceirizado();
    }

    /**
     * Testar hora maior 40
     */
    @Test
    public void avaliaEntradaHoraMaiorQuarenta() {
        assertThrows(RuntimeException.class, () -> empTerc.setHoras(45));
    }

    /**
     * Testar valor por hora menor que 30
     */
    @Test
    public void avaliaEntradaValorPorHoraMenorTrinta() {
        assertThrows(RuntimeException.class, () -> empTerc.setValorPorHora(20.0));
    }

    /**
     * Testar valor por hora maior que 200
     */
    @Test
    public void avaliaEntradaValorPorHoraMaiorDuzentos() {
        assertThrows(RuntimeException.class, () -> empTerc.setHoras(201));
    }

    /**
     * Testar adicional menor que 100
     */
    @Test
    public void avaliaEntradaAdicionalMenorCem() {
        assertThrows(RuntimeException.class, () -> empTerc.setAdicional(50.0));
    }

    /**
     * Testar adicional maior que 1100
     */
    @Test
    public void avaliaEntradaAdicionalMaiorMilCem() {
        assertThrows(RuntimeException.class, () -> empTerc.setAdicional(1150.0));
    }

    /**
     * Testar realizar pagamento setHora, setValorPorHora, setAdicional
     */
    @Test
    public void avaliaRealizarPagamento() {
        empTerc.setNome("José da Silva II");
        empTerc.setHoras(0);
        empTerc.setValorPorHora(150.0);
        empTerc.setAdicional(100.0);
        assertThrows(RuntimeException.class, () -> empTerc.realizarPagamento());
    }

    /**
     * Testar realizar pagamento setHora, setValorPorHora
     */
    @Test
    public void avaliaRealizarPagamentoTwo() {
        empTerc.setNome("José da Silva II");
        empTerc.setHoras(11);
        empTerc.setValorPorHora(100.0);
        empTerc.setAdicional(100.0);
        assertThrows(RuntimeException.class, () -> empTerc.realizarPagamento());
    }

    /**
     * Testar realizar pagamento setHora, setValorPorHora
     */
    @Test
    public void avaliaRealizarPagamentoThree() {
        empTerc.setNome("José da Silva II");
        empTerc.setHoras(10);
        empTerc.setValorPorHora(100.0);
        empTerc.setAdicional(100.0);
        assertThrows(RuntimeException.class, () -> empTerc.realizarPagamento());
    }
}

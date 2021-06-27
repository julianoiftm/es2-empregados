package Test;

import Empregado.Empregado;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmpregadoTest {

    private Empregado emp;

    @BeforeEach
    private void instanciar() {
        emp = new Empregado();
    }

    /**
     * Testar hora maior 40
     */
    @Test
    public void avaliaEntradaHoraMaiorQuarenta() {
        assertThrows(RuntimeException.class, () -> emp.setHoras(45));
    }

    /**
     * Testar hora menor 40
     */
    @Test
    public void avaliaEntradaHoraMenorQuarenta() {
        assertThrows(RuntimeException.class, () -> emp.setHoras(20));
    }

    /**
     * Testar valor por hora menor que 30
     */
    @Test
    public void avaliaEntradaValorPorHoraMenorTrinta() {
        assertThrows(RuntimeException.class, () -> emp.setValorPorHora(20.0));
    }

    /**
     * Testar valor por hora maior que 200
     */
    @Test
    public void avaliaEntradaValorPorHoraMaiorDuzentos() {
        assertThrows(RuntimeException.class, () -> emp.setHoras(201));
    }

    /**
     * Testar valor por hora maior que 30 e menor que 200
     */
    @Test
    public void avaliaEntradaValorPorHoraMaiorTrintaMenorDuzentos() {
        assertThrows(RuntimeException.class, () -> emp.setValorPorHora(150.0));
    }

    /**
     * Testar realizar pagamento setHora, setValorPorHora, setAdicional
     */
    @Test
    public void avaliaRealizarPagamento() {
        emp.setNome("José da Silva II");
        emp.setHoras(45);
        emp.setValorPorHora(300.0);
        assertThrows(RuntimeException.class, () -> emp.realizarPagamento());
    }

    /**
     * Testar realizar pagamento setHora, setValorPorHora
     */
    @Test
    public void avaliaRealizarPagamentoTwo() {
        emp.setNome("José da Silva II");
        emp.setHoras(36);
        emp.setValorPorHora(300.0);
        assertThrows(RuntimeException.class, () -> emp.realizarPagamento());
    }

    /**
     * Testar realizar pagamento setHora, setValorPorHora
     */
    @Test
    public void avaliaRealizarPagamentoThree() {
        emp.setNome("José da Silva II");
        emp.setHoras(30);
        emp.setValorPorHora(100.0);
        assertThrows(RuntimeException.class, () -> emp.realizarPagamento());
    }
}

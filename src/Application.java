import Empregado.Empregado;
import Empregado.EmpregadoTercerizado;

public class Application {
    public static void main(String[] args) {
        testeEmpregadoTeceiro();
    }

    public static void testeEmpregado() {
        Empregado emp1 = new Empregado();
        emp1.setNome("José da Silva");
        emp1.setHoras(37);
        emp1.setValorPorHora(89.50);
        System.out.println(emp1);
        System.out.println("O Salário de " + emp1.getNome() + " será de R$ " + Empregado.realizarPagamento(emp1.getValorPorHora(), emp1.getHoras()));
    }

    public static void testeEmpregadoTeceiro() {
        EmpregadoTercerizado emp2 = new EmpregadoTercerizado();
        emp2.setNome("José da Silva II");
        emp2.setHoras(36);
        emp2.setValorPorHora(100.0);
        emp2.setAdicional(1200.0);
        System.out.println("Pagamento: " + emp2.realizarPagamento());
    }
}

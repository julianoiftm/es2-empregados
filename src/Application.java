import Empregado.Empregado;

public class Application {
    public static void main(String[] args) {
        Empregado emp1 = new Empregado();
        emp1.setNome("José das Couves");
        emp1.setHoras(40);
        emp1.setValorPorHora(30.0);

       System.out.println(emp1);
    }
}

package Empregado;

public class EmpregadoTercerizado extends Empregado {

    private Double adicional;

    public EmpregadoTercerizado() {
        super();
    }

    public EmpregadoTercerizado(Double adicional) {
        this.adicional = adicional;
    }

    public Double getAdicional() {
        return adicional;
}

    public void setAdicional(Double adicional) {
        this.adicional = adicional;
    }

    public double realizarPagamento() {
        return 0.0;
    }

}

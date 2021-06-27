package Empregado;

public class EmpregadoTerceirizado extends Empregado {

    private Double adicional;

    public EmpregadoTerceirizado() {
        super();
    }

    public Double getAdicional() {
        return adicional;
    }

    public void setAdicional(Double adicional) {
        if (adicional < 100.0 || adicional > 1100.0) throw new IllegalArgumentException("O adicional precisa estar entre R$100 e R$1.100!!");
        this.adicional = adicional;
    }

    public double realizarPagamento() {
        return (getValorPorHora() != 0.0 && getHoras() != 0 && getAdicional() != 0.0)
                ? Math.max(((getValorPorHora() * getHoras()) + getAdicional()), 1100.0)
                : 0.0;
    }
}

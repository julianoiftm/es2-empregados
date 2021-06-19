package Empregado;

import java.util.logging.Logger;

public class EmpregadoTercerizado extends Empregado {

    private static final Logger log = Logger.getLogger(EmpregadoTercerizado.class.getName());

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
        try {
            if(adicional >= 100.0 && adicional <= 1100.0){
                this.adicional = adicional;
            } else {
                log.warning("O adicional precisa estar entre R$100 e R$1.100");
            }
        } catch (Exception e) {
            log.warning(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "{ " +
                "nome: " + getNome() + ", " +
                "horas: " + getHoras() + ", " +
                "valorPorHora: " + getValorPorHora()  + ", " +
                "adicional: " + getAdicional() +
                " }";
    }

    public double realizarPagamento() {
        return 0.0;
    }

}

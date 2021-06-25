package Empregado;

import lombok.*;
import java.util.logging.Logger;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Empregado {

    private static final Logger log = Logger.getLogger(Empregado.class.getName());

    private String nome;
    private Integer horas;
    private Double valorPorHora;

    public void setHoras(Integer horas) {
        try {
            if(horas <= 40){
                this.horas = horas;
            } else {
                this.horas = 0;
                log.warning("O empregado não pode trabalhar mais de 40h diárias.");
            }
        } catch (Exception e) {
            log.warning(e.getMessage());
        }
    }
    public void setValorPorHora(Double valorPorHora) {
        try {
            if(valorPorHora >= 30.0 && valorPorHora <= 200.0) {
                this.valorPorHora = valorPorHora;
            } else {
                this.valorPorHora = 0.0;
                log.warning("O valor da hora precisa estar entre R$30 e R$200");
            }
        } catch (Exception e) {
            log.warning(e.getMessage());
        }
    }

    public static double realizarPagamento(double valorHora, double qtdeHoras) {
        double salarioMinimo = 1100.0;
        if(valorHora != 0.0 && qtdeHoras != 0){
            return Math.max((valorHora * qtdeHoras), salarioMinimo);
        } else {
            return 0.0;
        }
    }
}

package Empregado;

import lombok.*;

// classe criada de acordo com os requisitos

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Empregado {

    private String nome;
    private Integer horas;
    private Double valorPorHora;

    public void setHoras(Integer horas) {
        if (horas > 40) throw new IllegalArgumentException("Quantidade de horas tem que ser menor que 40!!");
        this.horas = horas;
    }

    public void setValorPorHora(Double valorPorHora) {
        if (valorPorHora < 30.0 || valorPorHora > 200.0) throw new IllegalArgumentException("O valor da hora precisa estar entre R$30 e R$200");
        this.valorPorHora = valorPorHora;
    }

    public double realizarPagamento() {
        if (getValorPorHora() == 0.0 || getHoras() == 0) throw new IllegalArgumentException("Valor por hora, nem a hora podem serem '0'!!");
        return Math.max((getValorPorHora() * getHoras()), 1100.0);
    }
}

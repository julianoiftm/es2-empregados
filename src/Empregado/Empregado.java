package Empregado;

import java.util.logging.Logger;

public class Empregado {

    private static final Logger log = Logger.getLogger(Empregado.class.getName());

    private String nome;
    private Integer horas;
    private Double valorPorHora;

    public Empregado() {
        super();
    }

    public Empregado(String nome, Integer horas, Double valorPorHora) {
        this.nome = nome;
        this.horas = horas;
        this.valorPorHora = valorPorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        try {
            if(horas <= 40){
                this.horas = horas;
            } else {
                log.warning("O empregado não pode trabalhar mais de 40h diárias.");
            }
        } catch (Exception e) {
            log.warning(e.getMessage());
        }
    }

    public Double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(Double valorPorHora) {
        try {
            if(valorPorHora >= 30.0 && valorPorHora <= 200.0) {
                this.valorPorHora = valorPorHora;
            } else {
                log.warning("O valor da hora precisa estar entre R$30 e R$200");
            }
        } catch (Exception e) {
            log.warning(e.getMessage());
        }
    }

    @Override
    public String toString() {
        double salario = realizarPagamento();
        return "{ " +
                "nome: " + getNome() + ", " +
                "horas: " + getHoras() + ", " +
                "valorPorHora: " + getValorPorHora()  + ", " +
                "salario: " + salario +
                " }";
    }

    public double realizarPagamento() {
        if (getHoras() != null && getValorPorHora() != null) {
            double salMinimo = 1100.0;
            double totalCalculado = getHoras() * getValorPorHora();
            return Math.max(totalCalculado, salMinimo);
        } else {
            log.warning("Violação de parametros da classe Empregados.");
            return 0.0;
        }
    }
}
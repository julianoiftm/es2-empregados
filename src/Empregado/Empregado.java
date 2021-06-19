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
        this.valorPorHora = valorPorHora;
    }

    @Override
    public String toString() {
        return "{ " +
                "nome: " + getNome() + ", " +
                "horas: " + getHoras() + ", " +
                "valorPorHora: " + getValorPorHora()  +
                " }";
    }

    public double realizarPagamento() {
        return 0.0;
    }
}

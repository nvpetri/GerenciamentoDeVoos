package br.senai.sp.jandira.model;

import java.util.Date;

abstract class Voo {
    private String companhia, destino, origem, horaSaida,dataSaida;
    private int qtdePassageiros, numeroVoo;

    public Voo(String companhia, String destino, String origem, String horaSaida, String dataSaida, Integer numeroVoo, Integer qtdePassageiros) {
        this.companhia = companhia;
        this.destino = destino;
        this.origem = origem;
        this.horaSaida = horaSaida;
        this.dataSaida = dataSaida;
        this.numeroVoo = numeroVoo;
        this.qtdePassageiros = qtdePassageiros;
    }

    public String print() {
        return "Companhia: " + companhia + "\n" +
                "Destino: " + destino + "\n" +
                "Origem: " + origem + "\n" +
                "Hora de Saída: " + horaSaida + "\n" +
                "Data de Saída: " + dataSaida + "\n" +
                "Número do Voo: " + numeroVoo + "\n" +
                "Quantidade de Passageiros: " + qtdePassageiros;
    }

    public String getCompanhia() {
        return companhia;
    }

    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(String horaSaida) {
        this.horaSaida = horaSaida;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public int getQtdePassageiros() {
        return qtdePassageiros;
    }

    public void setQtdePassageiros(int qtdePassageiros) {
        this.qtdePassageiros = qtdePassageiros;
    }

    public int getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(int numeroVoo) {
        this.numeroVoo = numeroVoo;
    }
}

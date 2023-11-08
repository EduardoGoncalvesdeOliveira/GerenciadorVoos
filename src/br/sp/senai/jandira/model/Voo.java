package br.sp.senai.jandira.model;

public abstract class Voo {
    private String numeroVoo;
    private String origem;
    private String destino;
    private String dataPartida;
    private String horaPartida;

    public Voo(String numeroVoo, String origem, String destino, String dataPartida, String horaPartida) {
        this.numeroVoo = numeroVoo;
        this.origem = origem;
        this.destino = destino;
        this.dataPartida = dataPartida;
        this.horaPartida = horaPartida;
    }

    // Métodos abstratos a serem implementados nas classes concretas

    public abstract String getNomeCompanhia();

    public abstract int getCapacidadePassageiros();

    // Getters e setters

    public String getNumeroVoo() {
        return numeroVoo;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public String getDataPartida() {
        return dataPartida;
    }

    public String getHoraPartida() {
        return horaPartida;
    }
}

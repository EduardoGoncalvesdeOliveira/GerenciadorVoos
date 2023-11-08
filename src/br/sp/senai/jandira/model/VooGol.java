package br.sp.senai.jandira.model;

public class VooGol extends Voo {
    private int capacidadePassageiros;

    public VooGol(String numeroVoo, String origem, String destino, String dataPartida, String horaPartida, int capacidadePassageiros) {
        super(numeroVoo, origem, destino, dataPartida, horaPartida);
        this.capacidadePassageiros = capacidadePassageiros;
    }

    @Override
    public String getNomeCompanhia() {
        return "VooGol";
    }

    @Override
    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }
}

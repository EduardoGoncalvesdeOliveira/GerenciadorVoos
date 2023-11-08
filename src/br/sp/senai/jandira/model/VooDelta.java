package br.sp.senai.jandira.model;

public class VooDelta extends Voo {
    private int capacidadePassageiros;

    public VooDelta(String numeroVoo, String origem, String destino, String dataPartida, String horaPartida, int capacidadePassageiros) {
        super(numeroVoo, origem, destino, dataPartida, horaPartida);
        this.capacidadePassageiros = capacidadePassageiros;
    }

    @Override
    public String getNomeCompanhia() {
        return "VooDelta";
    }

    @Override
    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }
}

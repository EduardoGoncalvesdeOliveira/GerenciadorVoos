package br.sp.senai.jandira.model;

    public class VooEmirates extends Voo {
        private int capacidadePassageiros;

        public VooEmirates(String numeroVoo, String origem, String destino, String dataPartida, String horaPartida, int capacidadePassageiros) {
            super(numeroVoo, origem, destino, dataPartida, horaPartida);
            this.capacidadePassageiros = capacidadePassageiros;
        }

        @Override
        public String getNomeCompanhia() {
            return "VooEmirates";
        }

        @Override
        public int getCapacidadePassageiros() {
            return capacidadePassageiros;
        }
    }


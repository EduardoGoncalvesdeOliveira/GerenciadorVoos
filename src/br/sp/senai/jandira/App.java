package br.sp.senai.jandira;
import br.sp.senai.jandira.model.Voo;
import br.sp.senai.jandira.model.VooDelta;
import br.sp.senai.jandira.model.VooEmirates;
import br.sp.senai.jandira.model.VooGol;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Voo voo1 = new Voo("AA123", "New York", "Los Angeles", "2023-11-08", "09:00") {
            @Override
            public String getNomeCompanhia() {
                return null;
            }

            @Override
            public int getCapacidadePassageiros() {
                return 0;
            }
        };
        VooGol voo2 = new VooGol("GG456", "padoca", "Rio de Janeiro", "2023-11-09", "10:30", 150);

        VooEmirates voo3 = new VooEmirates("ART024", "Itapevi", "Itapecirica da serra", "2023-11-09", "10:30", 150);

        VooDelta voo4 = new VooDelta("EGO0476", "Carapicuíba", "Liberdade", "2023-11-09", "10:30", 150);

        List<Voo> voos = new ArrayList<>();
        voos.add(voo1);
        voos.add(voo2);
        voos.add(voo3);
        voos.add(voo4);

        String origemBusca = "Itapevi";
        for (Voo voo : voos) {
            if (voo.getOrigem().equals(origemBusca)) {
                System.out.println("Voo de " + voo.getOrigem() + " para " + voo.getDestino() +
                        " no dia " + voo.getDataPartida() + " às " + voo.getHoraPartida());
                if (voo instanceof VooGol || voo instanceof VooEmirates || voo instanceof VooDelta) {
                    System.out.println("Capacidade de passageiros: " + "não consegui e me frustrei");
                }
            }
        }
    }
}
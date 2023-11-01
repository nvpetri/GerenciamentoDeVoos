package br.senai.sp.jandira;

import br.senai.sp.jandira.model.VooDelta;
import br.senai.sp.jandira.model.VooEmirates;
import br.senai.sp.jandira.model.VooGol;

public class Main {
    public static void main(String[] args) {
        VooGol vooGol = new VooGol("Gol", "SBGR - Guarulhos", "SBGL - Galeão", "13:40", "08/09/2024", 925, 132);
        VooEmirates vooEmirates = new VooEmirates("Emirates", "SBGR - Guarulhos", "MEX - Benito Juarez Mexico City Airport", "13:40", "08/09/2024", 307, 320);
        VooDelta vooDelta = new VooDelta("Delta", "SBGR - Guarulhos", "SBSP - Congonhas", "13:40", "08/09/2024", 250, 89);

        System.out.println(vooGol.print());
        System.out.println();
        System.out.println(vooEmirates.print());
        System.out.println();
        System.out.println(vooDelta.print());
    }
}

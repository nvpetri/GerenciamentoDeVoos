package br.senai.sp.jandira.model;

import java.util.Date;

public class VooEmirates extends Voo{
    public VooEmirates(String companhia, String destino, String origem, String horaSaida, String dataSaida, Integer numeroVoo, Integer qtdePassageiros) {
        super ("Emirates","SBGR - Guarulhos", "MEX - Benito Juarez Mexico City Airport", "13:40", "08/09/2024", 307, 320);
    }
    @Override
    public String print() {
        return "Voo Emirates\n" + super.print();
    }
}

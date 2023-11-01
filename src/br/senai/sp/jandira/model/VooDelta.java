package br.senai.sp.jandira.model;

import java.util.Date;

public class VooDelta extends Voo{
    public VooDelta(String companhia, String destino, String origem, String horaSaida, String dataSaida, Integer numeroVoo, Integer qtdePassageiros) {
        super ("Delta","SBGR - Guarulhos", "SBSP - Congonhas", "13:40", "08/09/2024", 250, 89);
    }

    @Override
    public String print() {
        return "Voo Delta\n" + super.print();
    }
}

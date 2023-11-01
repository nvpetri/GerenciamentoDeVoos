package br.senai.sp.jandira.model;

import java.util.Date;

public class VooGol extends Voo{
    public VooGol(String companhia, String destino, String origem, String horaSaida, String dataSaida, Integer numeroVoo, Integer qtdePassageiros) {
        super ("Gol","SBGR - Guarulhos", "SBGL - Galeão", "13:40", "08/09/2024", 925, 132);
    }
    @Override
    public String print() {
        return "Voo Gol\n" + super.print();
    }
}

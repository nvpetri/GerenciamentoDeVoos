package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {

    public void mostrarMenu(){

        Scanner scanner = new Scanner(System.in);

        VooGol vooGol = new VooGol("Gol", "SBGR - Guarulhos", "SBGL - Galeão", "13:40", "08/09/2024", 925, 132);
        VooEmirates vooEmirates = new VooEmirates("Emirates", "SBGR - Guarulhos", "MEX - Benito Juarez Mexico City Airport", "13:40", "08/09/2024", 307, 320);
        VooDelta vooDelta = new VooDelta("Delta", "SBGR - Guarulhos", "SBSP - Congonhas", "13:40", "08/09/2024", 250, 89);

        boolean continuar = true;

        while (continuar){
            System.out.print("O que deseja fazer?");
            System.out.println();
            System.out.println("1 - Voos Gol");
            System.out.println("2 - Voos Emirates");
            System.out.println("3 - Voos Delta");

            int userOption = scanner.nextInt();


            switch (userOption){
                case 1:
                    System.out.println(vooGol.print());
                    break;
                case 2:
                    System.out.println(vooEmirates.print());
                    break;
                case 3:
                    System.out.println(vooDelta.print());
                    break;
                case 4:
                    continuar = false;
                    break;
            }
        }
    }
}

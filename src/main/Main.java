package main;
import java.util.Scanner;
import clases.Cine;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        Cine cine = new Cine("CINESA", 300, 3, 8, 7);

        int opcion = 0;
        String correo;
        int fila;
        int columna;

        System.out.println("\n" +
                "    __  ____  ____     ___ \n" +
                "   /  ]|    ||    \\   /  _]\n" +
                "  /  /  |  | |  _  | /  [_ \n" +
                " /  /   |  | |  |  ||    _]\n" +
                "/   \\_  |  | |  |  ||   [_ \n" +
                "\\     | |  | |  |  ||     |\n" +
                " \\____||____||__|__||_____|\n" +
                "                           \n");

        do {

            System.out.print("> "+ cine.getNombre()+" <\n\n 1 VER LAS SALAS Y DATOS DE SUS PELICULAS\n 2 RESERVAR BUTACAS\n 3 VER MATRIZ DE ASIENTOS DISPONIBLES\n 4 EXIT\n >> ");
            opcion =  sc.nextInt();

            switch (opcion){
                case 1:
                    cine.sacarpeliculasalas();
                    break;

                case 2:
                    System.out.print("INTRODUCE EL CORREO: ");
                    correo = sc.next();
                    System.out.print("INTRODUCE LA SALA: ");
                    opcion = sc.nextInt();
                    System.out.print("INTRODUCE LA FILA: ");
                    fila = sc.nextInt();
                    System.out.print("INTRODUCE LA COLUMNA: ");
                    columna = sc.nextInt();
                    cine.reservarbutacas(opcion,fila,columna,correo);
                    opcion = 2;
                    break;

                case 3:
                    System.out.print("INTRODUCE LA SALA: ");
                    cine.verbutacas(sc.nextInt());
                    break;

                case 4:
                    System.out.println("SALIENDO ...");
                    System.out.println("\n" +
                            " ___ ___  __ __    __  __ __   ____  _____      ____  ____    ____    __  ____   ____  _____\n" +
                            "|   |   ||  |  |  /  ]|  |  | /    |/ ___/     /    ||    \\  /    |  /  ]|    | /    |/ ___/\n" +
                            "| _   _ ||  |  | /  / |  |  ||  o  (   \\_     |   __||  D  )|  o  | /  /  |  | |  o  (   \\_ \n" +
                            "|  \\_/  ||  |  |/  /  |  _  ||     |\\__  |    |  |  ||    / |     |/  /   |  | |     |\\__  |\n" +
                            "|   |   ||  :  /   \\_ |  |  ||  _  |/  \\ |    |  |_ ||    \\ |  _  /   \\_  |  | |  _  |/  \\ |\n" +
                            "|   |   ||     \\     ||  |  ||  |  |\\    |    |     ||  .  \\|  |  \\     | |  | |  |  |\\    |\n" +
                            "|___|___| \\__,_|\\____||__|__||__|__| \\___|    |___,_||__|\\_||__|__|\\____||____||__|__| \\___|\n" +
                            "                                                                                            \nPOR CONFIAR EN " + cine.getNombre());
                    break;

                default:
                    System.out.println("\nINTRODUCE UN OPCION DE MENU VALIDA\n");
                    break;

            }
        } while (opcion != 4);
    }
}

package main;

import java.util.Arrays;
import java.util.Scanner;

import clases.Cine;
import clases.Pelicula;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        Cine cine = new Cine("CINESA", 300, 3, 7, 7);

        int opcion = 0;


        do {

            System.out.print("\nCINE\n 1 VER LAS SALAS Y DATOS DE SUS PEL\n 2 ELEGIR SALA Y BUTACA PARA RESERVAR\n 3 VER MATRIZ DE ASIENTOS DE X SALA\n 4 EXIT\n >> ");
            opcion =  sc.nextInt();

            switch (opcion){
                case 1:
                    cine.sacarpeliculasalas();
                    break;

                case 2:
                    break;

                case 3:
                    System.out.print("INTRODUCE LA SALA: ");
                    cine.verbutacas(sc.nextInt());
                    break;

                default:
                    System.out.println("INTRODUCE UN OPCION DE MENU VALIDA");
                    break;

            }
        } while (opcion != 10);



    }
}

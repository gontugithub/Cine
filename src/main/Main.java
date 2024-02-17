package main;
import java.util.Scanner;
import clases.Cine;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        Cine cine = new Cine("CINESA", 300, 3, 8, 7);

        int opcion = 0;
        String correo;
        int fila;
        int columna;


        do {

            System.out.print("\n> "+ cine.getNombre()+" <\n\n 1 VER LAS SALAS Y DATOS DE SUS PELICULAS\n 2 RESERVAR BUTACAS\n 3 VER MATRIZ DE ASIENTOS DISPONIBLES\n 4 EXIT\n >> ");
            opcion =  sc.nextInt();

            switch (opcion){
                case 1:
                    cine.sacarpeliculasalas();
                    break;

                case 2:
                    System.out.println("INTRODUCE EL CORREO: ");
                    correo = sc.next();
                    System.out.println("INTRODUCE LA SALA: ");
                    opcion = sc.nextInt();
                    System.out.println("INTRODUCE LA FILA: ");
                    fila = sc.nextInt();
                    System.out.println("INTRODUCE LA COLUMNA: ");
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
                    System.out.println("\n MUCHAS GRACIAS POR CONFIAR EN " + cine.getNombre());
                    break;

                default:
                    System.out.println("INTRODUCE UN OPCION DE MENU VALIDA");
                    break;

            }
        } while (opcion != 4);
    }
}

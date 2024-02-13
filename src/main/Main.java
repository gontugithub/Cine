package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;




        do {

            System.out.print("CINE\n 1 VER LAS SALAS Y DATOS DE SUS PEL\n 2 ELEGIR SALA Y BUTACA PARA RESERVAR\n 3 VER MATRIZ DE ASIENTOS DE X SALA\n >> ");
            opcion =  sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("HOLA");
                    break;

                case 2:
                    System.out.println("ADIOS");
                    break;

                case 3:
                    System.out.println("BUENAS");
                    break;
            }
        } while (opcion != 10);



    }
}

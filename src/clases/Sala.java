package clases;

public class Sala {

    private int numeroid;
    private int[][] butacas;

    public Sala(int numeroid,int filas, int columnas) {
        this.numeroid = numeroid;
        butacas = new int[filas][columnas];
    }
}

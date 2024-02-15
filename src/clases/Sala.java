package clases;

public class Sala {

    private int numeroid;
    private int[][] butacas;

    public Sala(int numeroid,int filas, int columnas, Pelicula Pelicula) {
        this.numeroid = numeroid;
        butacas = new int[filas][columnas];
    }
}

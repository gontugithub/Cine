package clases;

public class Cine {

    private String nombre;
    private int aforo;
    private Sala[] salas;

    public Cine(String nombre, int aforo, int numerosalas) {
        this.nombre = nombre;
        this.aforo = aforo;
        salas = new Sala[numerosalas];
    }
}

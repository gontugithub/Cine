package clases;

import java.util.Arrays;

public class Cine {

    private String nombre;
    private int aforo;
    private Sala[] salas;
	Pelicula peliculasarray[] = {new Pelicula("EL REY LEON", 120), new Pelicula("TITANIC", 80),  new Pelicula("TORRENTE", 210)};


	public Cine(String nombre, int aforo, int numerosalas, int filas, int columnas) {
        this.nombre = nombre;
        this.aforo = aforo;
        salas = new Sala[numerosalas];
        
        for (int i = 0; i<salas.length;i++) {
        	
        	// Añadimos los datos de cada sala solo faltaria añadirle la pelicula, que lo haremos en el main
        	
        	salas[i] = new Sala(i, filas, columnas, null);
        }
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAforo() {
		return aforo;
	}

	/**
	 * El aforo es el número de personas que caben en un cine.
	 * @param aforo tiene que ser siempre superior a cero e inferior a MAX_CAPACITY, que es la máxima
	 *              capacidad de nuestros cines. En el caso de que este valor sea introducido de forma
	 *              incorrecta devolverá un mensaje de error y fijará -1 como valor.
	 */
	public void setAforo(int aforo) {
		if (aforo < 0 || aforo > 1000) {
			System.out.println("Aforo incorrecto, -1 fijado.");
			aforo = -1;
		}
		this.aforo = aforo;
	}

	public Sala[] getSalas() {

		return salas;
	}

	public void setSalas(Sala[] salas) {
		this.salas = salas;
	}
	
	public void sacarpeliculasalas() {
		for (int i = 0; i<salas.length;i++){
			getSalas()[i].setPelicula(peliculasarray[i]);
			System.out.println("SALA " + (i+1));
			System.out.println("PELICULA; " + getSalas()[i].getPelicula().getTitulo() + "\nDURACION: " + getSalas()[i].getPelicula().getDuracion());
		}

	}
    
    
    
    
    
}

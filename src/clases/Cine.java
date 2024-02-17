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

	/**
	 * sacarpeliculasalas muestra todas las peliculas disponibles en el cine,
	 * muestra en que sala la van a proyectar, el titulo de la pelicula y su duracion
	 */
	
	public void sacarpeliculasalas() {
		for (int i = 0; i<salas.length;i++){
			getSalas()[i].setPelicula(peliculasarray[i]);
			System.out.println("\nSALA " + (getSalas()[i].getNumeroid()+1));
			System.out.println("PELICULA; " + getSalas()[i].getPelicula().getTitulo() + "\nDURACION: " + getSalas()[i].getPelicula().getDuracion());
		}

	}
	/**
	 * Ver butacas te muestra la matriz de la sala que le introduzcas.
	 *
	 * @param sala tiene que ser siempre un numero mayor que cero y menor o igual que el numero de salas
	 *			si metes una sala que no es correcta dara error mostrando un mensaje por pantalla "SALA NO ENCONTRADA"
	 */

	public void verbutacas(int sala){
		if (sala < salas.length && sala > 0){
			System.out.println("\n-PANTALLA-");
			for(int i = 0; i<getSalas()[sala].getButacas().length;i++){
				for (int j = 0; j<getSalas()[sala].getButacas()[i].length;j++){
					System.out.print(getSalas()[sala].getButacas()[i][j]+" ");
				}
				System.out.println();
			}

		} else {
			System.out.println("SALA NO ENCONTRADA");
		}

	}

	/**
	 * Te permite reservar una butaca en una sala, para ello necesita introducir estos atributos:
	 *
	 * @param sala de tipo int, indica la sala en la que quieres reservar la butaca
	 * @param fila de tipo int, indica la fila en la que quieres reservar la butaca
	 * @param columna de tipo int, indica la colummna en la que quieres reservar la butaca
	 * @param correo de tipo String, guardara su valor en la posición de la matriz donde la butaca se reserve;
	 *
	 * @apiNote cualquier dato de los anteriores si es introducido de marena errona se mostrará un mensaje de error
	 *		en el caso de que la butaca este ocupada, nos mostrara un mensaje de error
	 *	    si intentamos volver a reservar la misma butaca con el mismo correo nos dira que esta butaca ya la tenemos reservada.
	 *
	 */

	public void reservarbutacas(int sala, int fila, int columna, String correo) {

			if (sala < salas.length && sala > 0
					&& fila >= 0 && fila < getSalas()[sala].getButacas().length - 1
					&& columna >= 0 && columna < getSalas()[sala].getButacas()[sala].length - 1) {

				if(getSalas()[sala].getButacas()[fila][columna] == null){
					getSalas()[sala].getButacas()[fila][columna] = correo;
					System.out.println("\nSALA: " + sala+"\nBUTACA RESERVADA: " + fila+"-"+columna +"\nCORREO: "+correo);
				} else if (correo.equals(getSalas()[sala].getButacas()[fila][columna])){
					System.out.println("BUTACA SELECCIONADA YA LA TIENE RESERVDA");
				} else {
					System.out.println("BUTACA SELECCIONADA OCUPADA");
				}

			} else {
				System.out.println("DATO INTRODUCIDO INCORRECTO");
			}

	}}

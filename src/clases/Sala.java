package clases;

public class Sala {

    private int numeroid;
    private String[][] butacas;
    private Pelicula pelicula;

    public Sala(int numeroid,int filas, int columnas, Pelicula Pelicula) {
        this.numeroid = numeroid;
        butacas = new String[filas][columnas];
        this.pelicula = Pelicula;
    }

	public int getNumeroid() {
		return numeroid;
	}

	public void setNumeroid(int numeroid) {
		this.numeroid = numeroid;
	}

	public String[][] getButacas() {
		return butacas;
	}

	public void setButacas(String[][] butacas) {
		this.butacas = butacas;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}
    
    
}

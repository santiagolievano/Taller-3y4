package uniandes.dpoo.aerolinea.modelo;

public class Avion {
	
	//Atributos de la clase avi�n
	private String nombre;
	private int capacidad;
	
	//M�todo constructor de la clase avi�n.
	public Avion(String nNombre, int nCapacidad) {
		nombre = nNombre;
		capacidad = nCapacidad;
	}

	//M�todos de la clase Avion.
	public String getNombre() {
		return nombre;
	}
	
	public int getCapacidad() {
		return capacidad;
	}
}

package uniandes.dpoo.aerolinea.modelo;

public class Avion {
	
	//Atributos de la clase avión
	private String nombre;
	private int capacidad;
	
	//Método constructor de la clase avión.
	public Avion(String nNombre, int nCapacidad) {
		nombre = nNombre;
		capacidad = nCapacidad;
	}

	//Métodos de la clase Avion.
	public String getNombre() {
		return nombre;
	}
	
	public int getCapacidad() {
		return capacidad;
	}
}

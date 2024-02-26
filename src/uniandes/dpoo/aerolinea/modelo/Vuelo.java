package uniandes.dpoo.aerolinea.modelo;

import java.util.Collection;

import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class Vuelo {
	//Atributos de la clase Vuelo.
	private String fecha;
	
	//Método Constructor de la clase Vuelo.
	public Vuelo(Ruta nruta, String nFecha, Avion nAvion) {
		fecha = nFecha;
	}
	
	//Metodos de la clase Vuelo.
	public Ruta getRuta() {
		return null;
	}
	
	public String getFecha() {
		return fecha;
	}
	
	public Avion getAvion() {
		return null;
	}
	
	public Collection<Tiquete> getTiquetes(){
		return null;
	}
	
	public int venderTiquetes(Cliente nCliente, CalculadoraTarifas nCalculadora, int nCantidad) {
		return -1;
	}
	
	public boolean equals(Object nObj) {
		return false;
	}
}

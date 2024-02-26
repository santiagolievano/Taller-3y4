package uniandes.dpoo.aerolinea.modelo.cliente;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public abstract class Cliente {

	//Metodo constructor.
	public Cliente() {
		
	}
	
	//Metodos de la clase Cliente.
	public String getTipoCliente() {
		return null;
	}
	
	public String getIdentificador() {
		return null;
	}
	
	public void agregrarTiquete(Tiquete nTiquete) {
		//TODO 
	}
	
	public int calcularValorTotalTiquetes() {
		return -1;
	}
	
	public void usarTiquetes(Vuelo nVuelo) {
		//TODO
	}
}

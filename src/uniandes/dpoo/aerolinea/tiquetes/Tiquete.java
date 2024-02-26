package uniandes.dpoo.aerolinea.tiquetes;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class Tiquete {
	
	//Atributos de la clase Tiquete.
	private String codigo;
	private int tarifa;
	private boolean usado;
	
	//Método Constructor de la clase Tiquete. 
	public Tiquete(String nCodigo, Vuelo nVuelo, Cliente nClienteComprador, int nTarifa) {
		codigo = nCodigo;
		tarifa = nTarifa;
		
	}
	
	//Métodos de la clase Tiquete.
	public Cliente getCliente() {
		return null;
	}
	
	public Vuelo getVuelo() {
		return null;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public int getTarifa() {
		return tarifa;
	}
	
	public void marcarComoUsado() {	
		
	}
	
	public boolean esUsado() {
		return false;
	}
}

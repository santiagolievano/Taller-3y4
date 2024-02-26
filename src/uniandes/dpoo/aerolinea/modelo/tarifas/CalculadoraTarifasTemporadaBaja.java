package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class CalculadoraTarifasTemporadaBaja {

	//Atributos de CalculadoraTarifasTemporadaBaja
	protected int COSTO_POR_KM_NATURAL = 600;
	protected int COSTO_POR_KM_CORPORATIVO =900;
	protected double DESCUENTO_PEQ = 0.2;
	protected double DESCUENTO_MEDIANAS = 0.1;
	protected double DESCUENTO_GRANDES = 0.2;
	
	//Métodos de la CalculadoraTarifasTemporadaBaja.
	public int calcularCostoBase(Vuelo nVuelo, Cliente nCliente) {
		return -1;
	}
	
	public double calcularPorcenteDescuento(Cliente nClente) {
		return 0.0;
	}
	
}

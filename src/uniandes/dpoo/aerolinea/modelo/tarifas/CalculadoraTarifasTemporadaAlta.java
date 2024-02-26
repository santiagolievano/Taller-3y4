package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class CalculadoraTarifasTemporadaAlta {

	//Atributos de la clase CalculadoraTarifasTemporadaAlta
	protected int COSTO_POR_KM = 1000;
	
	//Metodos de la clase CalculadoraTarifasTemporadaAlta.
	public int calcularCostoBase(Vuelo nVuelo, Cliente nCliente) {
		return -1;
	}
	
	public double calcularPorcentajeDescuento(Cliente nCliente) {
		return 0.0;
	}
}

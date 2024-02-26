package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public abstract class CalculadoraTarifas {
	//Atributos de la clase ClaculadoraTarifas
	public double IMPUESTO = 0.28;
	
	//Métodos de la clase ClaculadoraTarifas
	public int calcularTarifas(Vuelo nVuelo, Cliente nCliente) {
		return -1;
	}
	
	protected int calcularCostoBase(Vuelo nVuelo, Cliente nCliente) {
		return -1;
	}
	
	protected double calcularPorcentajeDescuento(Cliente nCliente) {
		return 0.0;
	}
	
	protected int calcularDistanciaVuelo(Ruta nRuta) {
		return -1;
	}
	
	protected int calcularValorImpuestos(int nCostoBase) {
		return -1;
	}
}

package uniandes.dpoo.aerolinea.modelo.cliente;

public class ClienteNatural extends Cliente {

	//Atributos de la clase ClienteNatural.
	public String NATURAL = "Natural";
	private String nombre;
	
	//Método Costructor de la clase ClienteNatural.
	public ClienteNatural(String nNombre) {
		nombre = nNombre;
	}
	
	//Métodos de la clase ClienteNatural.
	public String getIdentificador() {
		return null;
	}
	
	public String getTipoCliente() {
		return null; 
	}
}

package uniandes.dpoo.aerolinea.modelo;

import java.sql.NClob;

/**
 * Esta clase tiene la informaciÃ³n de una ruta entre dos aeropuertos que cubre una aerolÃ­nea.
 */
public class Ruta
{
    // TODO completar
	//Atributos clase Ruta
	private String horaSalida;
	private String horaLlegada;
	private String codigoRuta;
	
	//método Constructor de la clase Ruta.
	public Ruta(Aeropuerto origen, String nHoraSalida, String nHoraLlegada, String ncodigoRuta) {
		horaSalida = nHoraSalida;
		horaLlegada = nHoraLlegada;
		codigoRuta = ncodigoRuta;
	}
	
	//Métodos de la clase Ruta.
	public String getCodigoRuta() {
		return codigoRuta;
	}
	
	public Aeropuerto getOrigen() {
		return null;
	} 
	
	public Aeropuerto getDestino() {
		return null;
	}
	
	public String getHoraSalida() {
		return horaSalida;
	}
	
	public String getHoraLlegada() {
		return horaLlegada;
	}
	
	public int getDuración() {
		int duracion = Integer.parseInt(horaLlegada) - Integer.parseInt(horaSalida);
		return duracion;
	}

    /**
     * Dada una cadena con una hora y minutos, retorna los minutos.
     * 
     * Por ejemplo, para la cadena '715' retorna 15.
     * @param horaCompleta Una cadena con una hora, donde los minutos siempre ocupan los dos Ãºltimos caracteres
     * @return Una cantidad de minutos entre 0 y 59
     */
    public static int getMinutos( String horaCompleta )
    {
        int minutos = Integer.parseInt( horaCompleta ) % 100;
        return minutos;
    }

    /**
     * Dada una cadena con una hora y minutos, retorna las horas.
     * 
     * Por ejemplo, para la cadena '715' retorna 7.
     * @param horaCompleta Una cadena con una hora, donde los minutos siempre ocupan los dos Ãºltimos caracteres
     * @return Una cantidad de horas entre 0 y 23
     */
    public static int getHoras( String horaCompleta )
    {
        int horas = Integer.parseInt( horaCompleta ) / 100;
        return horas;
    }

    
}

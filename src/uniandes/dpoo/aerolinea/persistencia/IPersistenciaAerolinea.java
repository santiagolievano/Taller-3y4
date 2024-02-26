package uniandes.dpoo.aerolinea.persistencia;

import java.io.IOException;

import uniandes.dpoo.aerolinea.exceptions.InformacionInconsistenteException;
import uniandes.dpoo.aerolinea.modelo.Aerolinea;

public interface IPersistenciaAerolinea {

	public void cargarAerolinea(String nArchivo, Aerolinea nAerolinea) throws IOException, InformacionInconsistenteException;

	public void salvarAerolinea(String nArchivo, Aerolinea nAerolinea);
}	
package arana.victor.pruebas.servicio.impl;

import arana.victor.pruebas.servicio.ServicioInterface;
import arana.victor.pruebas.servicio.exceptions.ServicioException;
import arana.victor.pruebas.servicio.exceptions.ServicioHacerXException;

public class ServicioImplementacionC implements ServicioInterface {

	@Override
	public void hacerX(int i) throws ServicioException {
		// Codigo de inicializacion.
		try {
			throw new ServicioHacerXException(i, "Hacer X con Excepcion");
		} catch (ServicioHacerXException shxE) {
			// Guardar
			throw new ServicioException(shxE.getMessage(), shxE);
		}
	}
}

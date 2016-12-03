package arana.victor.pruebas.servicio.impl;

import arana.victor.pruebas.servicio.ServicioInterface;
import arana.victor.pruebas.servicio.exceptions.ServicioException;
import arana.victor.pruebas.servicio.exceptions.ServicioHacerXException;

public class ServicioImplementacionD implements ServicioInterface {

	@Override
	public void hacerX(int i) throws ServicioException {
		// Código de inicialización.
		try {
			throw new ServicioHacerXException(i, "Error al hacer x");
		} catch (ServicioHacerXException shxE) {
			// Guardar
			System.out.println(shxE.getMessage() + " con parametro(s): " + shxE.getArgumento());
			throw shxE;
		}
	}

}

package arana.victor.pruebas.servicio.impl;

import arana.victor.pruebas.servicio.ServicioInterface;
import arana.victor.pruebas.servicio.exceptions.ServicioHacerXException;

public class ServicioImplementacionB implements ServicioInterface {

	@Override
	public void hacerX(int i) throws ServicioHacerXException {
		throw new ServicioHacerXException(i, "Hacer X con Excepcion");
	}

}

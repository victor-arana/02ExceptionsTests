package arana.victor.pruebas.servicio.impl;

import arana.victor.pruebas.servicio.ServicioInterface;
import arana.victor.pruebas.servicio.exceptions.ServicioHacerXException;


public class ServicioImplementacionA implements ServicioInterface {

	@Override
	public void hacerX(int i) throws ServicioHacerXException {
		System.out.println("Se ejecutó hacerX(" + i + ")");
	}

}

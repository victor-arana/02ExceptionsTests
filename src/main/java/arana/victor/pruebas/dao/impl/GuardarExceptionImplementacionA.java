package arana.victor.pruebas.dao.impl;

import arana.victor.pruebas.dao.GuardarExcepcionInterface;
import arana.victor.pruebas.dao.exceptions.GuardarExceptionException;

public class GuardarExceptionImplementacionA implements
		GuardarExcepcionInterface {

	@Override
	public void guardar(int a) throws GuardarExceptionException {
		System.out.println("Se guardo excepcion exitosamente.");
	}

}

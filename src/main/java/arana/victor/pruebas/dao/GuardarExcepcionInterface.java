package arana.victor.pruebas.dao;

import arana.victor.pruebas.dao.exceptions.GuardarExceptionException;

public interface GuardarExcepcionInterface {
	public void guardar(int a) throws GuardarExceptionException;

}

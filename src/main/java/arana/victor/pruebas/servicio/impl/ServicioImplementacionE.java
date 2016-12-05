package arana.victor.pruebas.servicio.impl;

import arana.victor.pruebas.dao.GuardarExcepcionInterface;
import arana.victor.pruebas.dao.exceptions.GuardarExceptionException;
import arana.victor.pruebas.dao.impl.GuardarExceptionImplementacionA;
import arana.victor.pruebas.dao.impl.GuardarExceptionImplementacionB;
import arana.victor.pruebas.servicio.ServicioInterface;
import arana.victor.pruebas.servicio.exceptions.ServicioException;
import arana.victor.pruebas.servicio.exceptions.ServicioHacerXException;

@SuppressWarnings("unused")
public class ServicioImplementacionE implements ServicioInterface {

	@Override
	public void hacerX(int i) throws ServicioException {
		// Código de inicialización.
		try {
			throw new ServicioHacerXException(i, "Error al hacer x");
		} catch (ServicioHacerXException shxE) {
			// Guardar
			GuardarExcepcionInterface servicioGuardado = new GuardarExceptionImplementacionB();
			try {
				servicioGuardado.guardar(1);
			} catch (GuardarExceptionException e) {
				throw new ServicioHacerXException(i, "Error al guardar x", e);
			}
			System.out.println(shxE.getMessage() + " con parametro(s): " + shxE.getArgumento());
			throw shxE;
		}

	}

}

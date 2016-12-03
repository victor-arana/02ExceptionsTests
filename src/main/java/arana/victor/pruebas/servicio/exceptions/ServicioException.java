package arana.victor.pruebas.servicio.exceptions;

public class ServicioException extends Exception {

	private static final long serialVersionUID = 1L;

	public ServicioException() {
		super();
	}

	public ServicioException(String message, Throwable cause) {
		super(message, cause);
	}

	public ServicioException(String message) {
		super(message);
	}

}

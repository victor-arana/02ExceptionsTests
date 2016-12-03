package arana.victor.pruebas.servicio.exceptions;


public class ServicioHacerXException extends ServicioException {

	private static final long serialVersionUID = 1L;
	
	private int argumento;

	public ServicioHacerXException(int argumento, String message, Throwable cause) {
		super(message, cause);
		this.argumento = argumento;
	}

	public int getArgumento() {
		return argumento;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ServicioHacerXException [argumento=");
		builder.append(argumento);
		builder.append("]");
		return builder.toString();
	}

}

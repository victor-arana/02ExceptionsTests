package arana.victor.pruebas;

import arana.victor.pruebas.servicio.ServicioInterface;
import arana.victor.pruebas.servicio.impl.ServicioImplementacionA;
import arana.victor.pruebas.servicio.impl.ServicioImplementacionB;

@SuppressWarnings("unused")
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	ServicioInterface servicio = new ServicioImplementacionB();
    	servicio.hacerX(123);
    }
}

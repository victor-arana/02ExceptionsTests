package arana.victor.pruebas;

import arana.victor.pruebas.servicio.ServicioInterface;
import arana.victor.pruebas.servicio.impl.ServicioImplementacionA;
import arana.victor.pruebas.servicio.impl.ServicioImplementacionB;
import arana.victor.pruebas.servicio.impl.ServicioImplementacionC;
import arana.victor.pruebas.servicio.impl.ServicioImplementacionD;

@SuppressWarnings("unused")
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	ServicioInterface servicio = new ServicioImplementacionD();
    	servicio.hacerX(123);
    }
}

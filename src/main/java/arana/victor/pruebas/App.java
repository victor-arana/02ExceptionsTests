package arana.victor.pruebas;

import arana.victor.pruebas.servicio.ServicioInterface;
import arana.victor.pruebas.servicio.impl.ServicioImplementacionA;
import arana.victor.pruebas.servicio.impl.ServicioImplementacionB;
import arana.victor.pruebas.servicio.impl.ServicioImplementacionC;
import arana.victor.pruebas.servicio.impl.ServicioImplementacionD;
import arana.victor.pruebas.servicio.impl.ServicioImplementacionE;

@SuppressWarnings("unused")
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	ServicioInterface servicio = new ServicioImplementacionE();
    	servicio.hacerX(123);
    }
}

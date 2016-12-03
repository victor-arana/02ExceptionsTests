package arana.victor.pruebas;

import arana.victor.pruebas.servicio.ServicioInterface;
import arana.victor.pruebas.servicio.impl.ServicioImplementacionA;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	ServicioInterface servicio = new ServicioImplementacionA();
    	servicio.hacerX(123);
    }
}

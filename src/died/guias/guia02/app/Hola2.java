package died.guias.guia02.app;

import java.util.Date;
import java.util.GregorianCalendar;

/** Clase de test de java
* @author joaquin
*/

public class Hola2 {
	
	/**
	* Este método ejecuta la aplicación cuyo propósito será imprimir en consola
	* el día, mes y año actual.
	* Luego sumarle 250 horas a dicha fecha e imprimir la fecha futura.
	* @param args no se esperan argumentos
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// tener en cuenta que en JAVA para la clase Calendar, el mes empieza en CERO,
		// es decir que ENERO no es el mes 1 sino el mes CERO!!!
		Date fechaActual = new Date();
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(fechaActual);
		Integer dia = calendar.get(GregorianCalendar.DAY_OF_MONTH);
		Integer mes = 1+calendar.get(GregorianCalendar.MONTH);
		Integer anio = calendar.get(GregorianCalendar.YEAR);
		System.out.println("Hola la fecha de hoy es: "+dia+"/"+mes+"/"+anio);
		calendar.add(GregorianCalendar.HOUR, 250);
		dia = calendar.get(GregorianCalendar.DAY_OF_MONTH);
		mes = 1+calendar.get(GregorianCalendar.MONTH);
		anio = calendar.get(GregorianCalendar.YEAR);
		System.out.println("La fecha 250 horas despues sera: "+dia+"/"+mes+"/"+anio);
		
	}

}

package com.adaptador;
/**
 * Clase que convierte el nombre del usuario en un hash del mismo.
 * @author zedin
 *
 */
public class CualquierCosa extends Datos{

	@Override
	public void DarNombre(String nombreCompleto) {
		// TODO Auto-generated method stub
		System.out.println( "El nombre que usted ingreso fue: " + nombreCompleto );
		System.out.println( "El nombre transformado en cualquier cosa es: " + nombreCompleto.hashCode() );
	}

}

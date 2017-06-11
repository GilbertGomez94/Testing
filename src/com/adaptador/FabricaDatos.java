package com.adaptador;
/**
 * Clase que se encarga de fabricar todos los hijos de la clase Datos.
 * @author zedin
 *
 */
public class FabricaDatos {
	public static Adaptador Adaptador(){
		return new Adaptador();
	}
	public static Unir Unir(){
		return new Unir();
	}
	public static CualquierCosa CualquierCosa(){
		return new CualquierCosa();
	}

}

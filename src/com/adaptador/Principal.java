package com.adaptador;

import java.util.Scanner;

/**
 * Clase del cliente, se encarga de pedir los nombres.
 * 
 * @author zedin
 *
 */
public class Principal {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu();
	}
	/**
	 * Metodo que maneja el flujo de datos
	 */
	public static void Menu(){
		Datos datos;
		String nombreCompleto = "";
		System.out.println( "Indique su nombre completo." );
		nombreCompleto = scanner.nextLine();
		int opcion = 0;
		boolean seguir = true;
		while ( seguir ){
			System.out.println( "Indique que acción desea llevar a cabo:" );
			System.out.println( "1. Separar su nombre en dos cadenas." );
			System.out.println( "2. Transformar su nombre en cualquier cosa." );
			System.out.println( "3. Unir su nombre." );
			System.out.println( "0. Salir." );
			opcion = scanner.nextInt();
			switch( opcion ){
			case 1: 
				datos = FabricaDatos.Adaptador();
				datos.DarNombre( nombreCompleto );
				break;
			case 2:
				datos = FabricaDatos.CualquierCosa();
				datos.DarNombre( nombreCompleto );
				break;
			case 3:
				datos = FabricaDatos.Unir();
				datos.DarNombre( nombreCompleto );
				break;
			case 0:
				seguir = false;
			}
		}
		
	}

}

package evaluacion1;

import java.util.Scanner;

public class Caracmay {

	public static void main(String[] args) {
		// pide un String por pantalla y 
		// calcula cual es el carácter o caracteres Mayores y 
		// devuelve el carácter y la posición que ocupa
		
		String cadena;
		int posicion;
		char caractermayor;
		
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
		
		// leo cadena
		System.out.print("Introduzca un String: ");
		cadena = teclado.nextLine();
				
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
		
		// busco el caracter mayor
		caractermayor=cadena.charAt(0);
		posicion=1;
		while(posicion < cadena.length()){
			// comprobar si el caracter es el mayor
			if (cadena.charAt(posicion) > caractermayor ){
				// actualizo el valor de caractermayor
				caractermayor = cadena.charAt(posicion);
			}
			// actualizo la posicion
			posicion = posicion + 1;
		}
		
		// muestro el carácter mayor y la posición que ocupa
		posicion=0;
		while(posicion < cadena.length()){
			// compruebo si el caracter que esta en esa posicion es igual que el mayor
			if (cadena.charAt(posicion) == caractermayor){
				// si es igual
				System.out.println("Caracter Mayor: " + caractermayor + ". Posición: " + posicion);
			}
			// actualizo la posicion
			posicion = posicion + 1;
		}
			
	}

}

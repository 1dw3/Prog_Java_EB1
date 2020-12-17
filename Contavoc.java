package evaluacion1;

import java.util.Scanner;

public class Contavoc {

	public static void main(String[] args) {
		// solicita la introducción de una cadena por teclado. 
		// Cuenta el número de veces que se ha introducido cada una de las vocales 
		// sin diferenciar entre mayúsculas y minúsculas utilizando un array, y 
		// muestra el número de veces que se ha introducido cada una de las vocales
		
		String cadena;
		int posicion;
		int aes,es,ies,oes,ues;
		
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
		
		// leo cadena
		System.out.print("Introduzca un String: ");
		cadena = teclado.nextLine();
				
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
		
		// paso el String a minusculas
		cadena = cadena.toLowerCase();
		
		// busco las vocales
		aes=0;
		es=0;
		ies=0;
		oes=0;
		ues=0;
		posicion = 0;
		while(posicion < cadena.length()){
			// comprobar si el caracter es una vocal
			if (cadena.charAt(posicion) == 'a'){
				aes=aes+1;
			}
			else if (cadena.charAt(posicion) == 'e'){
				es=es+1;
			}
			else if (cadena.charAt(posicion) == 'i'){
				ies=ies+1;
			}
			else if (cadena.charAt(posicion) == 'o'){
				oes=oes+1;
			}
			else if (cadena.charAt(posicion) == 'u'){
				ues=ues+1;
			}
			// actualizo la posicion
			posicion = posicion + 1;
		}
		
		// muestro número de veces que se ha introducido cada vocal
		System.out.println("El caracter a se ha introducido " + aes + " veces.");
		System.out.println("El caracter e se ha introducido " + es + " veces.");
		System.out.println("El caracter i se ha introducido " + ies + " veces.");
		System.out.println("El caracter o se ha introducido " + oes + " veces.");
		System.out.println("El caracter u se ha introducido " + ues + " veces.");
		
			
	}

}

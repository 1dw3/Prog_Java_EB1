package evaluacion1;

import java.util.Scanner;

public class Arraysumaprimo {

	public static void main(String[] args) {
		// Pide números enteros por pantalla y los almacena en un array 
		// hasta que se introduzca un número negativo que no será tenido en cuenta. 
		// Después calcula la suma de todos ellos y comprueba si es un número primo o no.
		final int tamañomaximo=10;
		int numeroelementos;
		int n;
		int posicion;
		int [] arrayenteros = new int [tamañomaximo];
		int suma;
		boolean esprimo;
		
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
		
		// leo n
		System.out.print("Introduzca un número entero (-1 para Fin): ");
		n = teclado.nextInt();
		
		// inicializo numeroelementos
		numeroelementos = 0;
		while((numeroelementos < tamañomaximo) && (n >= 0)){
			arrayenteros[numeroelementos]=n;
			numeroelementos = numeroelementos + 1;
			// leo otro n
			System.out.print("Introduzca un número entero (-1 para Fin): ");
			n = teclado.nextInt();
		}
	
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
		
		if (numeroelementos > 0){
			// si se han introducido números
		
			// calculo la suma
			suma=0;
			posicion = 0;
			while (posicion < numeroelementos){
				suma = suma + arrayenteros[posicion];
				posicion=posicion+1;
			}
			
			// muestro el resultado
			System.out.print("La suma es "+ suma + ".");
			
			// compruebo si la suma es un número primo
			esprimo = true;
			posicion = 2;
			while (posicion < suma){
				if((suma % posicion) == 0){
					// si no es primo
					esprimo = false;
					break;
				}
				// paso a la siguiente posicion
				posicion = posicion + 1;
			}
			
			if (esprimo){
				// si es primo
				System.out.println("Es primo.");
			}
			else {// si No es primo
				System.out.println("No es primo.");
			}
		}
		else{
			// si no se ha introducido ningún número válido
			System.out.println("Error. No se ha introducido ningún número válido.");
		}
	}

}

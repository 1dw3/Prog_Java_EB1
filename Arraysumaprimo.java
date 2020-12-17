package evaluacion1;

import java.util.Scanner;

public class Arraysumaprimo {

	public static void main(String[] args) {
		// Pide n�meros enteros por pantalla y los almacena en un array 
		// hasta que se introduzca un n�mero negativo que no ser� tenido en cuenta. 
		// Despu�s calcula la suma de todos ellos y comprueba si es un n�mero primo o no.
		final int tama�omaximo=10;
		int numeroelementos;
		int n;
		int posicion;
		int [] arrayenteros = new int [tama�omaximo];
		int suma;
		boolean esprimo;
		
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
		
		// leo n
		System.out.print("Introduzca un n�mero entero (-1 para Fin): ");
		n = teclado.nextInt();
		
		// inicializo numeroelementos
		numeroelementos = 0;
		while((numeroelementos < tama�omaximo) && (n >= 0)){
			arrayenteros[numeroelementos]=n;
			numeroelementos = numeroelementos + 1;
			// leo otro n
			System.out.print("Introduzca un n�mero entero (-1 para Fin): ");
			n = teclado.nextInt();
		}
	
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
		
		if (numeroelementos > 0){
			// si se han introducido n�meros
		
			// calculo la suma
			suma=0;
			posicion = 0;
			while (posicion < numeroelementos){
				suma = suma + arrayenteros[posicion];
				posicion=posicion+1;
			}
			
			// muestro el resultado
			System.out.print("La suma es "+ suma + ".");
			
			// compruebo si la suma es un n�mero primo
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
			// si no se ha introducido ning�n n�mero v�lido
			System.out.println("Error. No se ha introducido ning�n n�mero v�lido.");
		}
	}

}

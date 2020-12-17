package ebaluaketa1;

import java.util.Scanner;

public class arrayord {

	public static void main(String[] args) {
		// Recibe números enteros positivos por teclado y 
		// los almacena en un array en orden ascendente 
		// hasta que llega un número negativo que no será tenido en cuenta
		int n,posicion;
		int [] arrayenteros;
		arrayenteros = new int [10];
		int numeroelementos=0;

		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
		
		// leo n
		System.out.print("Introduzca un valor de tipo entero: ");
		n = teclado.nextInt();
		
		if (n >= 0){
			// el primer n positivo lo meto en la posicion 0
			arrayenteros[0] = n;
			numeroelementos++;
			
			// leo otro n
			System.out.print("Introduzca un valor de tipo entero: ");
			n = teclado.nextInt();
			
			while(n >= 0){
				// busco la posicion
				// inicializo la posicion
				posicion = 0;
				
				// recorro el array hasta que encuentre la posicion
				// solo recorro las posiciones validas
				while(posicion < numeroelementos){
					if(n < arrayenteros[posicion]){
						//System.out.println("Posicion: " + posicion);
						break;
					}
					posicion++;
				}
				
				// una vez que tengo la posicion
				// desplazo todos los elementos desde el final del array hasta posicion 
				// una posicion a la derecha
				int posmov=numeroelementos;
				
				while(posmov > posicion){
					// desplazo el valor una posicion a la derecha
					arrayenteros[posmov]=arrayenteros[posmov-1];
					// voy a la posicion anterior
					posmov--;
				}
				
				// lo meto en el array
				arrayenteros[posicion]=n;
				numeroelementos++;
				// leo otro n
				System.out.print("Introduzca un valor de tipo entero: ");
				n = teclado.nextInt();
			}
		}
	
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
		
		if (numeroelementos > 0){
			// si hay elementos en el array	
			
			// muestro el contenido del array por pantalla
			posicion=0;
			while (posicion < numeroelementos){
				System.out.print(arrayenteros[posicion]+" ");
				posicion++;
			}
		}
		else{
			// si NO hay elementos en el array
			System.out.println("Error. Array vacío.");
		}
	}

}

package evaluacion1;

import java.util.Scanner;

public class Diccionario {

	public static void main(String[] args) {
		// Recibe palabras por teclado y 
		// las almacena en un array de Strings en orden alfabético ascendente 
		// hasta que llega una cadena vacía que no será tenida en cuenta
		String cadena;
		int posicion;
		String [] diccionario = new String [10];
		int numeroelementos=0;

		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
		
		// leo cadena
		System.out.print("Introduzca un String (cadena vacía para fin): ");
		cadena = teclado.nextLine();
		
		if (!cadena.isEmpty()){
			// la primera cadena la meto en la posicion 0
			diccionario[0] = cadena;
			numeroelementos++;
			
			// leo otra cadena
			System.out.print("Introduzca un String (cadena vacía para fin): ");
			cadena = teclado.nextLine();
			
			while(!cadena.isEmpty()){
				// busco la posicion
				// inicializo la posicion
				posicion = 0;
				
				// recorro el array hasta que encuentre la posicion
				// solo recorro las posiciones validas
				while(posicion < numeroelementos){
					if(cadena.compareTo(diccionario[posicion]) < 0){
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
					diccionario[posmov]=diccionario[posmov-1];
					// voy a la posicion anterior
					posmov--;
				}
				
				// lo meto en el array
				diccionario[posicion]=cadena;
				numeroelementos++;
				// leo otra cadena
				System.out.print("Introduzca un String (cadena vacía para fin): ");
				cadena = teclado.nextLine();
			}
		}
	
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
		
		if (numeroelementos > 0){
			// si hay elementos en el array	
			
			// muestro el contenido del array por pantalla
			posicion=0;
			while (posicion < numeroelementos){
				System.out.println(diccionario[posicion]);
				posicion++;
			}
		}
		else{
			// si NO hay elementos en el array
			System.out.println("Error. Array vacío.");
		}
	}

}

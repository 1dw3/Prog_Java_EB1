package ebaluaketa1;

import java.util.Scanner;

public class Bisiesto1c {

	public static void main(String[] args) {
		// pide un año por teclado y muestra por pantalla si es o no bisiesto. 
		// Un año es bisiesto si es múltiplo de 4 pero no lo es de 100 excepto si también es múltiplo de 400
		// Para la solución se usa una única condición
		int año;
		
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
		
		// leo el año
		System.out.print("Introduzca el año: ");
		año = teclado.nextInt();
		
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
		
		if (((año % 4 == 0) && (año % 100 != 0)) || (año % 400 == 0)) {
			System.out.println("Bisiesto");
		}
		else {
			System.out.println("NO Bisiesto");
		}
		
	}
}

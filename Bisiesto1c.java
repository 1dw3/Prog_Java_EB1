package ebaluaketa1;

import java.util.Scanner;

public class Bisiesto1c {

	public static void main(String[] args) {
		// pide un a�o por teclado y muestra por pantalla si es o no bisiesto. 
		// Un a�o es bisiesto si es m�ltiplo de 4 pero no lo es de 100 excepto si tambi�n es m�ltiplo de 400
		// Para la soluci�n se usa una �nica condici�n
		int a�o;
		
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
		
		// leo el a�o
		System.out.print("Introduzca el a�o: ");
		a�o = teclado.nextInt();
		
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
		
		if (((a�o % 4 == 0) && (a�o % 100 != 0)) || (a�o % 400 == 0)) {
			System.out.println("Bisiesto");
		}
		else {
			System.out.println("NO Bisiesto");
		}
		
	}
}

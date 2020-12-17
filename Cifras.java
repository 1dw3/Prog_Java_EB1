package ebaluaketa1;

import java.util.Scanner;

public class Cifras {

	public static void main(String[] args) {
		// Guarda un n�mero en memoria y pide n�meros hasta que se acierta el n�mero 
		// El programa muestra si el n�mero introducido es mayor o menor que el almacenado 
		// en memoria as� como el n�mero de intentos que lleva el usuario
		int n,cifra;
		int cociente;
		
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
			
		// leemos n
		System.out.print("Introduzca un valor de tipo entero: ");
		n = teclado.nextInt();
		
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
		
		// calculo la cifra
		cifra = n % 10;
		// la muestro
		System.out.print(cifra + " ");
		
		// calculo el cociente
		cociente = n / 10;
				
		while (cociente > 0){
			//mientras tengo cociente
			
			// calculo la cifra
			cifra = cociente % 10;
			// la muestro
			System.out.print(cifra + " ");
			// calculo el cociente
			cociente = cociente / 10;
		}

	}

}

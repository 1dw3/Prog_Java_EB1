package evaluacion1;

import java.util.Scanner;

public class Factoria {

	public static void main(String[] args) {
		// un número por teclado y calcula su factorial
		int n;
		int posicion;
		int factorial;
		
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
		
		// informo al usuario de lo que tiene que hacer
		System.out.print("Introduzca un valor de tipo entero: ");
		
		// lee un número entero por teclado
		n = teclado.nextInt();
		
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
		
		factorial = 1;
		posicion = 2;
		while (posicion <= n){
			factorial = factorial * posicion;
			posicion = posicion + 1;
		}
		System.out.print("Factorial = " + factorial);
	}

}

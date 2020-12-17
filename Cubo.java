package evaluacion1;

import java.util.Scanner;

public class Cubo {

	public static void main(String[] args) {
		// lee un número por teclado y calcula el cubo de ese número 
		int n;
		int cubo;
		
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
		
		// informo al usuario de lo que tiene que hacer
		System.out.print("Introduzca un valor de tipo entero: ");
		
		// lee un número entero por teclado
		n = teclado.nextInt();
		
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
		
		// calcula el cubo
		cubo = n * n * n;
		
		// muestro el mensaje
		System.out.println("El cubo de " + n + " es " + cubo);
		
	}

}

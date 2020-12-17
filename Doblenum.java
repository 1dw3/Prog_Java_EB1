package evaluacion1;

import java.util.Scanner;

public class Doblenum {

	public static void main(String[] args) {
		// lee un número entero por teclado, calcula su doble, y lo muestra por pantalla 
		int n;
		int doble;
		
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
		
		// informo al usuario de lo que tiene que hacer
		System.out.print("Introduzca un valor de tipo entero: ");
		
		// lee un número entero por teclado
		n = teclado.nextInt();
		
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
		
		// calcula su doble
		doble = n * 2;
		
		// muestro el mensaje
		System.out.println("El Doble de la variable introducida es " + doble);
		
	}

}

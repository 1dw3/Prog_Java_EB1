package evaluacion1;

import java.util.Scanner;

public class Leercaracter {

	public static void main(String[] args) {
		// lee un caracter por teclado y 
		// muestra por pantalla el mensaje "El valor de la variable introducida es "
		char c;
		
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
		
		// informo al usuario de lo que tiene que hacer
		System.out.print("Introduzca un valor de tipo caracter: ");
		
		// lee un caracter por teclado como un String del que cojo la primera posicion
		c = teclado.next().charAt(0);
		
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
		
		// muestro el mensaje
		System.out.println("El valor de la variable introducida es " + c);
		
	}

}

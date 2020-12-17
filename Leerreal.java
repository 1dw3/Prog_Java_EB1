package evaluacion1;

import java.util.Scanner;

public class Leerreal {

	public static void main(String[] args) {
		// lee un número real por teclado y 
		// muestra por pantalla el mensaje "El valor de la variable introducida es "
		double r;
		
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
		
		// informo al usuario de lo que tiene que hacer
		System.out.print("Introduzca un valor de tipo real: ");
		
		// lee un número real por teclado
		r = teclado.nextDouble();
		
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
		
		// muestro el mensaje
		System.out.println("El valor de la variable introducida es " + r);
		
	}

}

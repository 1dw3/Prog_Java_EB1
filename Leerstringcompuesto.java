package evaluacion1;

import java.util.Scanner;

public class Leerstringcompuesto {

	public static void main(String[] args) {
		// lee un String por teclado y 
		// muestra por pantalla el mensaje "El valor de la variable introducida es "
		String s;
		
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
		
		// informo al usuario de lo que tiene que hacer
		System.out.print("Introduzca un valor de tipo String: ");
		
		// lee un String por teclado
		s = teclado.nextLine();
		
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
		
		// muestro el mensaje
		System.out.println("El valor de la variable introducida es " + s);
		
	}

}

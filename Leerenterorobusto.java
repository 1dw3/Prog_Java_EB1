package evaluacion1;

import java.util.Scanner;

public class Leerenterorobusto {

	public static void main(String[] args) {
		// lee un número entero de forma robusta por teclado 
		int n;
		String valor;
		
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
		
		// informo al usuario de lo que tiene que hacer
		System.out.print("Introduzca un valor de tipo entero: ");
		
		// lee un String por teclado
		valor = teclado.next();
		// convierto el valor a Integer y se lo doy a n
		n=Integer.parseInt(valor);
		
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
		
		// muestro el mensaje
		System.out.println("El valor de la variable introducida es " + n);
		
	}

}

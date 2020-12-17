package evaluacion1;

import java.util.Scanner;

public class Leernum1 {

	public static void main(String[] args) {
		// lee un número entero por teclado, le suma 1, y lo muestra por pantalla 
		int n;
		int suma;
		
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
		
		// informo al usuario de lo que tiene que hacer
		System.out.print("Introduzca un valor de tipo entero: ");
		
		// lee un número entero por teclado
		n = teclado.nextInt();
		
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
		
		// le suma 1
		suma = n + 1;
		
		// muestro el mensaje
		System.out.println("El valor de la variable introducida incrementado en 1 es " + suma);
		
	}

}

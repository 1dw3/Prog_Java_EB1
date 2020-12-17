package evaluacion1;

import java.util.Scanner;

public class Calcuiva {

	public static void main(String[] args) {
		// lee un número real por teclado y 
		// muestra por pantalla el mensaje "El valor de la variable introducida es "
		double cantidad;
		double iva;
		
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
		
		// informo al usuario de lo que tiene que hacer
		System.out.print("Introduzca la cantidad: ");
		
		// lee un número real por teclado
		cantidad = teclado.nextDouble();
		
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
		
		// calculo el IVA
		if (cantidad < 20000.0) {
			iva = cantidad * 0.07;
		}
		else {
			iva = cantidad * 0.16;
		}
		// muestro el mensaje

		System.out.println("El IVA de " + cantidad + " es de " + iva);
		
	}

}

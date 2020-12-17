package evaluacion1;

import java.util.Scanner;

public class Loncircu {

	public static void main(String[] args) {
		// lee el valor del radio por teclado y  
		// muestra el valor de la circunferencia de ese radio por pantalla con dos decimales
		double r;
		double circunferencia;
		
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
		
		// informo al usuario de lo que tiene que hacer
		System.out.print("Introduzca un valor de tipo real: ");
		
		// lee un número real por teclado
		r = teclado.nextDouble();
		
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
		
		// calcula la circunferencia
		circunferencia = 2 * Math.PI * r;
		
		// muestro el resultado con dos decimales 
		System.out.printf("El valor de la circunferencia de radio %.2f es %.2f",r,circunferencia);
		
	}

}

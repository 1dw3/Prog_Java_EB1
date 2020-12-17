package eb1;

import java.util.Scanner;

public class Areacirc {

	public static void main(String[] args) {
		// lee el valor del radio por teclado y  
		// muestra el valor del circulo de ese radio por pantalla con dos decimales
		double r;
		double circulo;
		
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
		
		// informo al usuario de lo que tiene que hacer
		System.out.print("Introduzca un valor de tipo real: ");
		
		// lee un número real por teclado
		r = teclado.nextDouble();
		
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
		
		// calcula el circulo
		circulo = Math.PI * (r * r);
		
		// muestro el resultado con dos decimales 
		System.out.printf("El valor del círculo de radio %.2f es %.2f",r,circulo);
		
	}

}

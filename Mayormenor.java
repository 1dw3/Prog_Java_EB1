package evaluacion1;

import java.util.Scanner;

public class Mayormenor {

	public static void main(String[] args) {
		// lee dos números por teclado a y b y muestra por pantalla 
		// si el primero es mayor que el segundo, si el segundo es mayor que el primero 
		// o si son iguales
		int a,b;
		
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
		
		// informo al usuario de lo que tiene que hacer
		System.out.print("Introduzca el valor de A: ");
		// lee un número entero por teclado
		a = teclado.nextInt();
		
		// informo al usuario de lo que tiene que hacer
		System.out.print("Introduzca el valor de B: ");
		// lee un número entero por teclado
		b = teclado.nextInt();
			
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
		
		// si el primero es mayor que el segundo
		if (a > b) {
			System.out.println("A es mayor que B");
		}
		else{
			if (a < b) {
				System.out.println("A es menor que B");
			}
			else {
				System.out.println("A es igual que B");
			}
		}
	}
}

package evaluacion1;

import java.util.Scanner;

public class Mayor3n {

	public static void main(String[] args) {
		// lee tres n�meros por teclado y muestra por pantalla cual o cuales son los mayores
		int a,b,c;
		
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
		
		// leo el valor del primer numero
		System.out.print("Introduzca el valor del primer numero: ");
		a = teclado.nextInt();
		
		// leo el valor del segundo numero
		System.out.print("Introduzca el valor del segundo numero: ");
		b = teclado.nextInt();
			
		// leo el valor del tercer numero
		System.out.print("Introduzca el valor del tercer numero: ");
		c = teclado.nextInt();
		
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
		
		if (a > b) {
			if (a > c) {
				System.out.println("El n�mero 1 es mayor");
			}
			else {
				if (a == c) { 
					System.out.println("El n�mero 1 y el 3 son mayores");
				}
				else {
					System.out.println("El n�mero 3 es mayor");
				}
			}
		}
		else {
			if (a < b) {
				if (b > c) {
					System.out.println("El n�mero 2 es mayor");
				}
				else {
					if (b == c) {
						System.out.println("El n�mero 2 y el 3 son mayores");
					}
					else {
						System.out.println("El n�mero 3 es mayor");
					}
				}
			}
			else {
				if (a < c) {
					System.out.println("El n�mero 3 es mayor");
				}
				else {
					if (a == c) {
						System.out.println("Los 3 n�meros son iguales");
					}
					else {
						System.out.println("El n�mero 1 y el 2 son mayores");
					}
				}
			}
		}	
	}
}

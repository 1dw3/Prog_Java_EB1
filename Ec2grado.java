package evaluacion1;

import java.util.Scanner;

public class Ec2grado {

	public static void main(String[] args) {
		// calcula las soluciones de una ecuación de 2º grado. 
		// Si las raíces son complejas muestra el mensaje de error "Raíces Complejas"

		double a,b,c,x1,x2,determinante;
		
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
		
		// informo al usuario de lo que tiene que hacer
		System.out.println("Ax^2 + Bx + C = 0");
		
		//leo a
		System.out.print("A = ");
		a = teclado.nextDouble();
		
		//leo b
		System.out.print("B = ");
		b = teclado.nextDouble();
			
		//leo c
		System.out.print("C = ");
		c = teclado.nextDouble();
		
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
		
		determinante = ((b * b) - (4 * a * c)); 
		if (determinante < 0) {
			System.out.println("Raíces Complejas");
		}
		else {
			if (determinante == 0) {
				x2 = x1 = (-b/(2*a));		
				System.out.println("x1 = " + x1 + " y x2 = " + x2);
			}
			else {
				x1 = (-b + Math.sqrt(determinante))/(2*a);
				x2 = (-b - Math.sqrt(determinante))/(2*a);
				System.out.println("x1 = " + x1 + " y x2 = " + x2);
			}
		}
	}

}

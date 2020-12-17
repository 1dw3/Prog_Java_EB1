package evaluacion1;

import java.util.Scanner;

public class Contrase {

	public static void main(String[] args) {
		// pide un nombre por pantalla y una contrase�a. 
		// Compara los valores con unos valores predefinidos y 
		// si coinciden muestra un mensaje de bienvenida. 
		// Si no coinciden muestra un mensaje de error por pantalla. 
		// El proceso se repite hasta que los datos son correctos o 
		// hasta que se produzcan m�s de 3 intentos
		
		String nombrecorrecto = "1dw3";
		String contrase�acorrecta = "1dw3";
		String nombre;
		String contrase�a;
		int intentos;
		boolean escorrecto;
		
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
		
		// leo nombre
		System.out.print("Nombre: ");
		nombre = teclado.next();
				
		// leo contrase�a
		System.out.print("Contrase�a: ");
		contrase�a = teclado.next();
		
		escorrecto = false;
		intentos = 1;
		while (intentos < 3){
			if (nombre.equals(nombrecorrecto) && contrase�a.equals(contrase�acorrecta)){
				escorrecto = true;
				break;
			}
			System.out.println("Datos Incorrectos. Le quedan " + (3-intentos) + " intentos.");
			
			// leo nombre
			System.out.print("Nombre: ");
			nombre = teclado.next();
				
			// leo contrase�a
			System.out.print("Contrase�a: ");
			contrase�a = teclado.next();
			
			intentos = intentos + 1;
		}
		
		if (escorrecto){
			// si los datos son correctos
			System.out.println("Bienvenido " + nombre);
		}
		else {
			// si ha superado el n�mero de intentos
			System.out.println("Datos incorrectos. Ha superado el n�mero de intentos permitidos.");
		}
		
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
			
	}

}

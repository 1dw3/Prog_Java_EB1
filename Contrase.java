package evaluacion1;

import java.util.Scanner;

public class Contrase {

	public static void main(String[] args) {
		// pide un nombre por pantalla y una contraseña. 
		// Compara los valores con unos valores predefinidos y 
		// si coinciden muestra un mensaje de bienvenida. 
		// Si no coinciden muestra un mensaje de error por pantalla. 
		// El proceso se repite hasta que los datos son correctos o 
		// hasta que se produzcan más de 3 intentos
		
		String nombrecorrecto = "1dw3";
		String contraseñacorrecta = "1dw3";
		String nombre;
		String contraseña;
		int intentos;
		boolean escorrecto;
		
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
		
		// leo nombre
		System.out.print("Nombre: ");
		nombre = teclado.next();
				
		// leo contraseña
		System.out.print("Contraseña: ");
		contraseña = teclado.next();
		
		escorrecto = false;
		intentos = 1;
		while (intentos < 3){
			if (nombre.equals(nombrecorrecto) && contraseña.equals(contraseñacorrecta)){
				escorrecto = true;
				break;
			}
			System.out.println("Datos Incorrectos. Le quedan " + (3-intentos) + " intentos.");
			
			// leo nombre
			System.out.print("Nombre: ");
			nombre = teclado.next();
				
			// leo contraseña
			System.out.print("Contraseña: ");
			contraseña = teclado.next();
			
			intentos = intentos + 1;
		}
		
		if (escorrecto){
			// si los datos son correctos
			System.out.println("Bienvenido " + nombre);
		}
		else {
			// si ha superado el número de intentos
			System.out.println("Datos incorrectos. Ha superado el número de intentos permitidos.");
		}
		
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
			
	}

}

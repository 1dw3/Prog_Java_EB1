package evaluacion1;

import java.util.Scanner;

public class LeerstringCadenaVacia {

	public static void main(String[] args) {
		// lee un String con el valor "" 
		// y muestra "Cadena vac�a "
		String s;
		
		// leo s
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca un valor de tipo String: ");
		
		// lee un String por teclado
		s = teclado.nextLine();
		if(s.isEmpty()){
			// si es la cadena vac�a ""
			// muestro el mensaje
			System.out.println("Cadena vac�a ");
		}
		else {
			// muestro el mensaje
			System.out.println("Cadena: " + s);
		}
		
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
		
		
		
	}

}

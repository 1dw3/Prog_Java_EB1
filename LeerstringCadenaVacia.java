package evaluacion1;

import java.util.Scanner;

public class LeerstringCadenaVacia {

	public static void main(String[] args) {
		// lee un String con el valor "" 
		// y muestra "Cadena vacía "
		String s;
		
		// leo s
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca un valor de tipo String: ");
		
		// lee un String por teclado
		s = teclado.nextLine();
		if(s.isEmpty()){
			// si es la cadena vacía ""
			// muestro el mensaje
			System.out.println("Cadena vacía ");
		}
		else {
			// muestro el mensaje
			System.out.println("Cadena: " + s);
		}
		
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
		
		
		
	}

}

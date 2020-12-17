package evaluacion1;

import java.util.Scanner;

public class Maximini {

	public static void main(String[] args) {
		// Calcula el valor m�ximo y m�nimo de unos n�meros introducidos por teclado. 
		// La introducci�n de n�meros cesar� cuando se introduzca un n�mero negativo que no ser� tenido en cuenta
		int n,maximo,minimo;
		
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
		
		// leo n
		System.out.print("Introduzca un valor de tipo entero: ");
		n = teclado.nextInt();

		if (n >= 0){
			maximo = n;
			minimo = n;
			while (n >= 0){
				if (n > maximo){
					maximo = n;
				}
				if (n < minimo){
					minimo = n;
				}
				// leo otro n
				System.out.print("Introduzca un valor de tipo entero: ");
				n = teclado.nextInt();
			} // fin-while
			System.out.print("M�ximo " + maximo + " M�nimo: " + minimo);
		} //fin-if
		
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();

	}

}

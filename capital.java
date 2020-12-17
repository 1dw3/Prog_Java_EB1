package ebaluaketa1;

import java.util.Scanner;

public class capital {

	public static void main(String[] args) {
		// pide una cantidad en euros, un tipo de interés (ej: 5,50%), y un período de tiempo expresado en días
		// calcula el interés producido en ese tiempo en base a la fórmula 
		// Interes=(Cantidad*TipoInteres*Tiempo)/(360*100)
		// muestra un mensaje como "El Interés de 100.00 € al 3.60 % durante 100 días es de 1.00 €"

		double cantidad;
		double tipo;
		int dias;
		double interes;
		
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
		
		// informo al usuario de lo que tiene que hacer
		System.out.print("Introduzca la cantidad: ");
		// lee cantidad
		cantidad = teclado.nextDouble();
		
		// informo al usuario de lo que tiene que hacer
		System.out.print("Introduzca el tipo de Interés: ");
		// lee tipo
		tipo = teclado.nextDouble();
		
		// informo al usuario de lo que tiene que hacer
		System.out.print("Introduzca el número de días: ");
		// lee dias
		dias = teclado.nextInt();
		
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
		
		// calculo el interes
		interes=(cantidad * tipo * dias)/(360*100);
		
		// muestro el mensaje
		// "El Interés de 100.00 € al 3.60 % durante 100 días es de 1.00 €"
		System.out.printf("El Interés de %.2f € al %.2f %% durante %d días es de %.2f €",cantidad,tipo,dias,interes);
		
	}

}

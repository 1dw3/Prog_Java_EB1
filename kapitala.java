package ebaluaketa1;

import java.util.Scanner;

public class kapitala {

	public static void main(String[] args) {
		// pide una cantidad en euros, un tipo de inter�s (ej: 5,50%), y un per�odo de tiempo expresado en d�as
		// calcula el inter�s producido en ese tiempo en base a la f�rmula 
		// Interes=(Cantidad*TipoInteres*Tiempo)/(360*100)
		// muestra un mensaje como "El Inter�s de 100.00 � al 3.60 % durante 100 d�as es de 1.00 �"

		double dirua;
		double itasa;
		int egunak;
		double interesa;
		
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teklatua = new Scanner(System.in);
		
		// informo al usuario de lo que tiene que hacer
		System.out.print("Diru kopurua: ");
		// lee cantidad
		dirua = teklatua.nextDouble();
		
		// informo al usuario de lo que tiene que hacer
		System.out.print("Sartu interes tasa: ");
		// lee tipo
		itasa = teklatua.nextDouble();
		
		// informo al usuario de lo que tiene que hacer
		System.out.print("Egunak: ");
		// lee dias
		egunak = teklatua.nextInt();
		
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teklatua.close();
		
		// calculo el interes
		interesa=(dirua * itasa * egunak)/(365*100);
		
		// muestro el mensaje
		// "El Inter�s de 100.00 � al 3.60 % durante 100 d�as es de 1.00 �"
		System.out.printf(" %.2f �en interesa %.2f %%  %d egunetan %.2f �koa da",dirua,itasa,egunak,interesa);
		
	}

}

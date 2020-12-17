package ebaluaketa1;

import java.util.Scanner;

public class erronew {

	public static void main(String[] args) {
		// Calcula la raíz cuadrada de un número por el método de Newton. 
		// Este método consiste en calcular términos hasta que el valor absoluto de la diferencia 
		// entre el término actual y el anterior sea menor que una cantidad de Error determinada 
		// (en nuestro caso ERROR=0.00000001). Inicialmente Ranterior es la mitad del número. 
		// Para el cálculo de la raíz se utiliza la formula
		// Ractual=((Numero/Ranterior)+(Ranterior))/2

		double znb,erroa, aurrekoerroa, errorea;
		final double erroremaximoa = 0.00000001;
		
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teklatua = new Scanner(System.in);
		
		// leo n
		System.out.print("Introduzca un valor de tipo real: ");
		znb = teklatua.nextDouble();

		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teklatua.close();
		
		// calculo su raiz cuadrada
		erroa=znb;
		aurrekoerroa = znb/2;
		errorea=1;
		while(errorea > erroremaximoa){
			erroa=((znb/aurrekoerroa)+aurrekoerroa)/2;
			//errorea=aurrekoerroa-erroa;
			errorea=znb-Math.pow(erroa,2);
			/*if (errorea < 0){
				errorea = -errorea;
			}*/
			aurrekoerroa=erroa;
		}
		// Muestro el resultado
		System.out.println("SQRT("+ znb + ")= " + erroa);
		
			
	}

}

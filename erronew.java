package ebaluaketa1;

import java.util.Scanner;

public class erronew {

	public static void main(String[] args) {
		// Calcula la ra�z cuadrada de un n�mero por el m�todo de Newton. 
		// Este m�todo consiste en calcular t�rminos hasta que el valor absoluto de la diferencia 
		// entre el t�rmino actual y el anterior sea menor que una cantidad de Error determinada 
		// (en nuestro caso ERROR=0.00000001). Inicialmente Ranterior es la mitad del n�mero. 
		// Para el c�lculo de la ra�z se utiliza la formula
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

package evaluacion1;

import java.util.Scanner;

public class Arraysum {

	public static void main(String[] args) {
		// solicita la introducción de una matriz de números enteros por teclado, 
		// calcula la suma de los elementos de cada una de las filas y 
		// mete el resultado de ese cálculo en un array. 
		// Después visualiza el contenido del array por pantalla
		
		int n;
		int filas,columnas;
		int fila,columna;
		
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
		
		// leo filas
		System.out.print("Introduzca el número de filas de la matriz: ");
		filas = teclado.nextInt();
		
		// leo filas
		System.out.print("Introduzca el número de columnas de la matriz: ");
		columnas = teclado.nextInt();
		
		// creo la matriz
		int [][] matriz = new int[filas][columnas];

		// pido los datos de la matriz
		for (fila=0;fila < matriz.length;fila++){
			for (columna=0;columna < matriz[fila].length;columna++){
				// leo el valor de esa posicion
				System.out.print("matriz["+fila+"]["+columna+"]= ");
				n = teclado.nextInt();
				matriz[fila][columna]=n;
			}
		}
		
		// muestra el contenido de la matriz
		for (fila=0;fila < matriz.length;fila++){
			for (columna=0;columna < matriz[fila].length;columna++){
				// escribo el valor de esa posicion
				System.out.print(matriz[fila][columna]+ " ");
			}
			// escribo un salto de línea
			System.out.println();
		}
		
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
		
		// calculo la suma de cada una de las filas y la meto en una posicion de un array
		int []arraysuma=new int[filas];
		int suma;
		// recorro la matriz para sumar las filas
		for (fila=0;fila < matriz.length;fila++){
			suma=0;
			for (columna=0;columna < matriz[fila].length;columna++){
				// calculo las suma de las columnas
				suma = suma + matriz[fila][columna];
			}
			// meto la suma de la fila en su posicion del array
			arraysuma[fila]=suma;
		}
		
		// visualiza el contenido de arraysuma por pantalla
		for (fila=0;fila < arraysuma.length;fila++){
			// escribo el valor de esa posicion
			System.out.println("Suma Fila["+fila+"]= "+ arraysuma[fila]);
		}
		
		
	}

}

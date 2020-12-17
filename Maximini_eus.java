package eb1;

import java.util.Scanner;

public class Maximini_eus {

	public static void main(String[] args) {
		
		// Teklatutik sartutako zenbakien maximoa eta minimoa ematen ditu
		// Programa, zenbaki negatiboa sartzean amaituko da
		
		int znbk,maximo,minimo;
		
		
		// Teklatua eskaner klasse baten bidez deklaratuko dut
		Scanner teklatua = new Scanner(System.in);
		
		// leo n
		System.out.print("Sartu zenbaki oso bat: ");
		znbk = teklatua.nextInt();

		if (znbk >= 0){
			maximo = znbk;
			minimo = znbk;
			while (znbk >= 0){
				if (znbk > maximo){
					maximo = znbk;
				}
				if (znbk < minimo){
					minimo = znbk;
				}
				// beste znbk bat irakurriko dut
				System.out.print("Sartu zenbaki oso bat: ");
				znbk = teklatua.nextInt();
			} // while amaiera
			System.out.println("Maximoa " + maximo + " Minimo: " + minimo);
		} //if amaiera
		System.out.println("Agur");
		// eskanerra itxi
		teklatua.close();

	}

}

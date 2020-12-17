package ebaluaketa1;

import java.util.Scanner;

public class Hiztegi {

	public static void main(String[] args) {
		// Recibe palabras por teclado y 
		// las almacena en un array de Strings en orden alfabético ascendente 
		// hasta que llega una cadena vacía que no será tenida en cuenta
		String katea;
		int pos, i, j, k;
		String [] A_hiztegi = new String [3];
		int zenbatelementu=0;
		boolean lehenengoa=true;
		boolean sartuta=false;

		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teklatua = new Scanner(System.in);
		
		// leo cadena
		
		
		//if (!katea.isEmpty()){
		for (k=0;k<3;k++){
			System.out.print("Sartu kate bat:  ");
			katea = teklatua.nextLine();
			// leo otra cadena
			if (!lehenengoa){
				//i=0;
				//Posizio egokia bilatu behar dut elementua beste guztiekin konparatuz
				for (i=0;(i<zenbatelementu&& !sartuta);i++){
					//Sartutako zenbakia baino handiago bat aurkitzen dudanean, hori da posizioa
					
					if (katea.compareTo(A_hiztegi[i])<0){
						// elementu guztiak posizio bat igo beharko ditut
						for (j=zenbatelementu-1;j>=i;j--){
							A_hiztegi[j+1]=A_hiztegi[j];
						}
						// Sartutako zenbakia posizio egokian sartuko dut
						A_hiztegi[i]=katea;
						sartuta=true;
						//zenbat++;
					}
					//i++;
					// Sartutako zenbakia guztiak baino handiagoa bada, ez da sartu arrayan, 
					// beraz, azkeneko posizioan sartuko dut
					
				}
				if (!sartuta){
					A_hiztegi[zenbatelementu]=katea;
					//zenbat++;
				}
				sartuta=false;
			}
			// la primera cadena la meto en la posicion 0
			else{
				A_hiztegi[0] = katea;
				zenbatelementu++;
				lehenengoa=false;
			}
		}
	
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teklatua.close();
		
		
		for (i=0;i<3;i++){
				System.out.println(A_hiztegi[i]);
		}
		
		
	}

}

package ebaluaketa1;

import java.util.Scanner;

public class Arrayord_1 {

	public static void main(String[] args) {
		// Teklatutik zenbaki positiboak hartu eta array baten sartu negatiboa sartu arte
		// arrayko elementuak beti ordenatuta egongo dira

		int znbk,zenbat=0, i=0, j;
		int [] A_znbk;
		String hitza="";
		String A_hitzak[]=new String [20];
		A_znbk = new int [10];
		boolean lehenengoa=true;
		boolean sartuta=false;
		
		if (hitza.compareTo(A_hitzak[i])>0){};
		// Scanner klaseko elementu bat definitu teklatua izenekoa
		Scanner teklatua = new Scanner(System.in);
		
		// znbk irakurri
		System.out.print("Sartu zenbaki bat: ");
		znbk = teklatua.nextInt();
		
		while (znbk >= 0){
			// lehenengo elementua ez bada, arrayan kokatu behar dut
			if (!lehenengoa){
				//i=0;
				//Posizio egokia bilatu behar dut elementua beste guztiekin konparatuz
				for (i=0;(i<zenbat&& !sartuta);i++){
					//Sartutako zenbakia baino handiago bat aurkitzen dudanean, hori da posizioa
					
					if (znbk<A_znbk[i]){
						// elementu guztiak posizio bat igo beharko ditut
						for (j=zenbat-1;j>=i;j--){
							A_znbk[j+1]=A_znbk[j];
						}
						// Sartutako zenbakia posizio egokian sartuko dut
						A_znbk[i]=znbk;
						sartuta=true;
						//zenbat++;
					}
					//i++;
					// Sartutako zenbakia guztiak baino handiagoa bada, ez da sartu arrayan, 
					// beraz, azkeneko posizioan sartuko dut
					
				}
				if (!sartuta){
					A_znbk[zenbat]=znbk;
					//zenbat++;
				}
				sartuta=false;
			}
			// lehenengo zenbakia bada, 0 posizioan sartuko dut
			else {
				A_znbk[0] = znbk;
				lehenengoa=false;
				// zenbat++;
				
			}
			// Zenbaki baten prozesua amaitzen denean, beste zenbaki bat eskatuko dut
			// negatiboa izan arte
			zenbat++;
			System.out.print("Sartu zenbaki bat: ");
			znbk = teklatua.nextInt();
		}
					
		
		// Teklatu itxiko dut
		teklatua.close();
		// Arraya pantailatik aterako dut
		if (zenbat!=0){
			for (i=0;i<zenbat;i++){
				System.out.print(A_znbk[i]+"\n");
			}
		}
		else {
			System.out.print("Arraya hutsik dago");
		}
	}	
	
}

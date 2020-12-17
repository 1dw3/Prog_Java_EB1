package ebaluaketa1;

import java.util.Scanner;

public class hiztegia {

	public static void main(String[] args) {
		// Teklatutik 20 kate irakurri eta ordenatuta array baten sartu
		

		int zenbat=0, i, j, k;
		String katea;
		String [] A_hiztegi;
		A_hiztegi = new String [3];
		boolean lehenengoa=true;
		boolean sartuta=false;

		// Scanner klaseko elementu bat definitu teklatua izenekoa
		Scanner teklatua = new Scanner(System.in);
		
		// znbk irakurri
		
		
		for (k=0;k<3;k++){
			System.out.print("Sartu kate bat: ");
			katea = teklatua.next();
			// lehenengo elementua ez bada, arrayan kokatu behar dut
			if (!lehenengoa){
				// i=0;
				// Posizio egokia bilatu behar dut elementua beste guztiekin konparatuz
				for (i=0;i<zenbat && !sartuta;i++){
					//Sartutako zenbakia baino handiago bat aurkitzen dudanean, hori da posizioa
					if (katea.compareTo(A_hiztegi[i])<0){
						// elementu guztiak posizio bat igo beharko ditut
						for (j=zenbat-1;j>=i;j--){
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
					if (!sartuta){
						A_hiztegi[zenbat]=katea;
						//zenbat++;
					}
				}
			}
			
			// lehenengo zenbakia bada, 0 posizioan sartuko dut
			else {
				A_hiztegi[0] = katea;
				lehenengoa=false;
				
			}
			sartuta=false;
			// Zenbaki baten prozesua amaitzen denean, beste zenbaki bat eskatuko dut
			// negatiboa izan arte
			zenbat++;
			
		}
					
		
		// Teklatu itxiko dut
		teklatua.close();
		// Arraya pantailatik aterako dut
		for (i=0;i<zenbat;i++){
			System.out.print(A_hiztegi[i]+"\n");
		}
		
	}	

}

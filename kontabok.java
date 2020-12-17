package ebaluaketa1;

import java.util.Scanner;

public class kontabok {

	public static void main(String[] args) {
		// solicita la introducción de una cadena por teclado. 
		// Cuenta el número de veces que se ha introducido cada una de las vocales 
		// sin diferenciar entre mayúsculas y minúsculas utilizando un array, y 
		// muestra el número de veces que se ha introducido cada una de las vocales
		
		String katea;
		int i,j;
		int A_zenbat[]={0,0,0,0,0};
		char A_bokal[]={'a','e','i','o','u'};
		int luzera;
		boolean aurkitu;
		
		// scanner klaseko elementua definitu
		Scanner teklatua = new Scanner(System.in);
		
		// katea irakurri
		System.out.print("Sartu karaktere katea: ");
		katea = teklatua.nextLine();
		luzera= katea.length();
				
		// teklatua itxi
		teklatua.close();
		
		// katea letra txikietara
		katea = katea.toLowerCase();
		
		
		
		
		/*char A_katea [];
		A_katea = new char [luzera];
		for (i=0;i<luzera;i++){
			A_katea[i]=katea.charAt(i);
		}*/
		
		
		// Array bat definitu eta katea array horretan sartu 
		char A_katea[]=katea.toCharArray();
		
		
		// Bokalak bilatu
		/*for (i=0;i<luzera;i++){
			for (j=0;j<5;j++){
				if (A_katea[i]==A_bokal[j]){
					A_zenbat[j]++;
				}
			}
		}*/
		for (i=0;i<luzera;i++){
			//j=0; 
			aurkitu=false;
			//while (j<5 && !aurkitu){
			
			for (j=0;(j<5 && !aurkitu);j++){
				if (A_katea[i]==A_bokal[j]){
					A_zenbat[j]++;
					System.out.println("J="+j);
					aurkitu=true;
				}
				//j++;
			}
		}
		
		// Bokal bakoitza zenbatetan atera den aurkeztu
		for (i=0;i<5;i++){
			System.out.println(A_bokal[i]+" karakterea " + A_zenbat[i] + "tan sartu da");
		}
		
		
			
	}

}

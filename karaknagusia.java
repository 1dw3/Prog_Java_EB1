package ebaluaketa1;

import java.util.Scanner;

public class karaknagusia {

	public static void main(String[] args) {
		// pantailatik karaktere katea sartu eta zein karaktere den
		// nagusiena eta zein txikiena eta haien posizioa eman
		
		String katea;
		int poshandiena=0;
		int postxikiena=0;
		char handiena;
		char txikiena;
		int luzera;
		int i;
		
		// scanner klaseko elementua definitu
		Scanner teklatua = new Scanner(System.in);
		
		// leo cadena
		System.out.print("Sartu katea: ");
		katea = teklatua.nextLine();
		luzera=katea.length();
				
		// Teklatua itxi eta baliabideak askatu
		teklatua.close();
		
		//char A_kar[]=katea.toCharArray();
		
		
		
		
		char A_kar[];
		A_kar=new char [luzera];
		
		for (i=0;i<luzera;i++){
			A_kar[i]=katea.charAt(i);
		}
		
		
		// busco el caracter mayor
		handiena=A_kar[0];
		txikiena=A_kar[0];
		for (i=0;i<luzera;i++){
			if (A_kar[i]<txikiena){
				txikiena=A_kar[i];
				postxikiena=i;
			}
			if (A_kar[i]>handiena){
				handiena=A_kar[i];
				poshandiena=i;
			}
			
		}
		
			
		
		// txikiena, handiena eta posizioak aurkeztu
			System.out.println("Karaktere txikiena: " 
		+ txikiena + ". Posizioa: " + postxikiena);
			System.out.println("Karaktere handiena: " 
					+ handiena + ". Posizioa: " + poshandiena);
			
			
		}
			
	}



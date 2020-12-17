package ebaluaketa1;

import java.util.Scanner;

public class izenabanan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String izena;
		char BE;
		char letra;
		int pos;
		int i;
		int luzera=0;
		char arrayizena[];
		
		// scanner klaseko elementua definitu
		Scanner teklatua = new Scanner(System.in);
				
		// znbk irakurri
		System.out.print("Sartu zure izena: ");
		izena = teklatua.next();
		luzera=izena.length();
	
		arrayizena = new char [luzera];
		
		
		//System.out.println("Zure izena: "+izena+ "luzera:"+luzera);
		for (i=0;i<luzera;i++){
			arrayizena[i]=izena.charAt(i);
			
		}
		System.out.println("Zure izena: ");
		for (i=0;i<luzera;i++){
			System.out.println(arrayizena[i]);
			
		}
		System.out.println("Zure izena alderantziz: ");
		for (i=luzera-1;i>=0;i--){
			System.out.println(arrayizena[i]);
			
		}
		System.out.println("Letraren bat aldatu nahi duzu: B/E");
		BE= teklatua.next().charAt(0);
		if (BE=='B'){
			System.out.println("Sartu posizioa (0 n-1): ");
			pos= teklatua.nextInt();
			System.out.println("Sartu letra berria: ");
			letra= teklatua.next().charAt(0);
			arrayizena[pos]=letra;
			
		}
		System.out.println("Zure izen berria: ");
		for (i=0;i<luzera;i++){
			System.out.println(arrayizena[i]);
		}
		
		// teklatua itxi
				teklatua.close();
		
		

	}

}

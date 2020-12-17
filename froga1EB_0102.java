package ebaluaketa1;

import java.util.Scanner;

public class froga1EB_0102 {

	public static void main(String[] args) {
		// Lehen ebaluaketako froga 01 eta 02 kapituluak
		// Makina saltzailea
		
		double dirua=0;
		double prezioa=0;
		double sobera=0;
		double soberabider=0;
		int soberabiderosoa=0;
		int aukera;
				
		
		// Scanner klaseko objektua deklaratu teklatua izenekoa
		Scanner teklatua = new Scanner(System.in);
				
		// Menua aurkeztu eta aukera irakurri
		System.out.println("Ongi etorri txurdi makina saltzailera");
		System.out.println("Produktuak");
		System.out.println("1.- Kafea			0,43€");
		System.out.println("2.- Freskagarria		1,11€");
		System.out.println("3.- Ura				0,36€");
		System.out.println("Sartu dirua: ");
		dirua=teklatua.nextDouble();
		System.out.println("Zer hartuko duzu: ");
		aukera = teklatua.nextInt();
		//aukeraren arabera prezioa jarri
		switch (aukera) {
		case 1:
			prezioa=0.43;
			break;
		case 2:
			prezioa=1.11;
			break;
		case 3:
			prezioa=0.36;
			break;
		default: 	
			System.out.print("Aukera okerra");
			break;
		}
		
		// aukera okerra bada, ez egin ezer gehiagorik, bestela, jarraitu
		if (aukera==1||aukera==2||aukera==3){
			if (dirua>=prezioa) {
				//soberan dagoen dirua
				sobera=dirua-prezioa;
				System.out.println("Bueltak: " + sobera);
				
				//soberan dagoen dirua biko txanponetarako
				soberabider=sobera/2;
				//zatiketa zenbaki osora pasatu, zenbat txanpon diren jakiteko
				soberabiderosoa=(int)soberabider;
				//kendu soberan dagoen diruarin 2 euroko txanponen balioa
				sobera=sobera-soberabiderosoa*2;
				//Mezua atera pantailatik
				System.out.println(" 2€: "+soberabiderosoa);
				
				
				soberabider=sobera/1;
				soberabiderosoa=(int)soberabider;
				sobera=sobera-soberabiderosoa*1;
				System.out.println(" 1€: "+soberabiderosoa);
				
				soberabider=sobera/0.5;
				soberabiderosoa=(int)soberabider;
				sobera=sobera-soberabiderosoa*0.5;
				System.out.println(" 0,5€: "+soberabiderosoa);
				
				soberabider=sobera/0.2;
				soberabiderosoa=(int)soberabider;
				sobera=sobera-soberabiderosoa*0.2;
				System.out.println(" 0,2€: "+soberabiderosoa);
				
				soberabider=sobera/0.1;
				soberabiderosoa=(int)soberabider;
				sobera=sobera-soberabiderosoa*0.1;
				System.out.println(" 0,1€: "+soberabiderosoa);
				
				soberabider=sobera/0.05;
				soberabiderosoa=(int)soberabider;
				sobera=sobera-soberabiderosoa*0.05;
				System.out.println(" 0,05€: "+soberabiderosoa);
				
				soberabider=sobera/0.02;
				soberabiderosoa=(int)soberabider;
				sobera=sobera-soberabiderosoa*0.02;
				System.out.println(" 0,02€: "+soberabiderosoa);
				
				soberabider=sobera/0.01;
				soberabiderosoa=(int)soberabider;
				sobera=sobera-soberabiderosoa*0.01;
				System.out.println(" 0,01€: "+soberabiderosoa);
				
			}
			else{
				System.out.print("Ez daukazu saldo nahikorik");
			}
		}
			
		// Scanner klaseko objektua itxi
		teklatua.close();
		
		
		
	}
}

package ebaluaketa1;
//PR_2_03 KALKUBEZ. Programa honek, BEZ kalkulatuko du diru kopuruaren arabera

import java.util.Scanner;

public class kalkubez {
	public static void main(String[] args) {
		Scanner teklatua=new Scanner (System.in);
		double dirua,bez, guztira;
		int BEZ;
		System.out.println("Ongi etorri gure aplikazioetara!!!");
		System.out.println("Sartu diru kopurua: ");
		dirua=teklatua.nextDouble();
		if (dirua< 20000){
			BEZ=7;
		}
		else{
			BEZ=16;
		}
		bez=dirua*BEZ/100;
		guztira=dirua+bez;
		System.out.printf("Diru kopurua: %.2f \n", dirua);
		System.out.printf("BEZ(%d %%): %.2f\n", BEZ, bez);
		System.out.printf("Guztira: %.2f\n", guztira);
		teklatua.close();
		
	}

}

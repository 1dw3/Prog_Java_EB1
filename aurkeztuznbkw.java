package ebaluaketa1;

import java.util.Scanner;

public class aurkeztuznbkw {

	public static void main(String[] args) {
		// Zenbaki bat eskatuko du eta 
		
		int n;
		int znbk;
		
		// 
		Scanner teklatua = new Scanner(System.in);
		
		// 
		System.out.print("Sartu zenbaki oso positiboa ");
		
		// 
		znbk = teklatua.nextInt();
		
		// 
		teklatua.close();
		
		n = 1;
		while (n <= znbk){
			System.out.print(n + " ");
			n = n + 1;
		}
		
		for (n=1; n>znbk;n++){
			System.out.print(n + " ");
			n = n + 1;
		}
	}

}

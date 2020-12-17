package ebaluaketa1;
//PR_2_13 BISIESTO. Programa honek urtea bisiestoa den edo ez esaten du


import java.util.Scanner;

public class bisiesto {
	public static void main(String[] args) {
		Scanner teklatua=new Scanner (System.in);
		int urtea;
		System.out.println("Ongi etorri gure aplikazioetara!!!");
		System.out.println("Sartu urtea: ");
		urtea=teklatua.nextInt();
		
		if (urtea%4==0){
			if (urtea%100==0){
				if (urtea%400==0){
					System.out.printf ("Urtea Bisiesto da");
				}
				else{
					System.out.printf ("Urtea ez da Bisiesto");
				}
			}
			else{
				System.out.printf ("Urtea Bisiesto da");	
				}
			}
		else{
			System.out.printf ("Urtea ez da Bisiesto");	
			}
		
		
		teklatua.close();
		
	}

}

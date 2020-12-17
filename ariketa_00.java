package ebaluaketa1;

import java.util.Scanner;

//PR_1_14 AGERTUERREALA. Programa honek zenbaki erreal bat ateratzen du pantailatik
public class ariketa_00{
	//Metodo nagusia
	public static void main(String[] args) {
		Scanner teklatua=new Scanner (System.in);
		int znb=0, znb1=0, znb2=0, swap=0, kont=2;
		char jarraitu='B';
		while (jarraitu=='B') {
			do {
				System.out.println("Sartu lehenego zenbakia, 0 baino handiagoa: ");
				znb1=teklatua.nextInt();
				System.out.println("Sartu bigarren zenbakia 0 baino handiagoa: ");
				znb2=teklatua.nextInt();
			}while (znb1<=0 ||znb2<=0);
			if (znb1>znb2) {
				swap=znb1;
				znb1=znb2;
				znb2=swap;
			}
			znb=znb1;
			while (znb<=znb2) {
				while (znb%kont!=0) {
					kont++;
				}
				if (znb!=kont) {
					if (znb%2==0) {
						System.out.println(znb+ " 2aren multiploa da: ");
					}
					if (znb%3==0) {
						System.out.println(znb+ " 3aren multiploa da: ");
					}
					if (znb%5==0) {
						System.out.println(znb+ " 5aren multiploa da: ");
					}						
				}else {
					System.out.println(znb+ " zenbaki lehena da");
				}
				kont=2;
				znb++;
			}
			System.out.println(" Jarraitu nahi duzu (B/E)? ");
			jarraitu=teklatua.next().charAt(0);
		}
		teklatua.close();
	}
	
}



package eb1;

import java.util.Scanner;
import java.util.Random;

public class Fibonaci {

	public static void main(String[] args) {
		// Zenbaki bat teklatutik sartu eta fibonacci seriea kalkulatzen du
		// Fibonacciren serieak honako ezaugarri hauek jarraitzen ditu
		
		// F(0)=0;
		// F(1)=1;
		// n>=2 guztientzat
		// F(n)=F(n-1) + F(n-2);

		int znbk, kont;
		int fn=0,fn1,fn2;
		
		// Scanner klaseko objektu berri bat
		Scanner teklatua = new Scanner(System.in);
		
		// Pantailatik mezua atera
		System.out.print("Sartu zenbakia. Positiboa izan behar du: ");
		
		// Zenbaki bat irakurtzen dut teklatutik
		znbk= teklatua.nextInt();
		
		// Teklatua itxi baliabideak askatzeko
		teklatua.close();
		
		if (znbk == 0){
			System.out.print("0");
		}
		if (znbk == 1){
			System.out.print(" 1");
		}
		fn2 = 0;
		fn1 = 1;
		kont = 2;
		while (kont <= znbk){
			fn = fn1 + fn2;
			fn2=fn1;
			fn1=fn;
			
			kont = kont + 1;
		}
		
		System.out.print(" "+fn);
	}

}

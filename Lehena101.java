package eb1;

import java.util.Scanner;

public class Lehena101 {

	public static void main(String[] args) {
		// zenbaki bat irakurri eta lehena den edo ez esango du
		// aldagaiak
		int znbk=1;
		boolean lehena=true;
		int zati=2;
		int kont=1;
		
		//int kont=0;
		
		//Eskanerra deklaratu
		Scanner teklatua = new Scanner(System.in);
		
		//Zenbakia eskatu
		
		
		while(kont<=101) {
		
			for( zati=2; ((zati<znbk)&&(lehena));zati++){
				
				
				if((znbk%zati) == 0){
					lehena = false;
				}
				
				//kont++;
				
			}
			if (lehena) {
				System.out.println(znbk);
				System.out.println(kont);
				kont=kont+1;
				
			}
			znbk=znbk+1;
			lehena=true;
		}
		
		teklatua.close();
				
		
	}

}

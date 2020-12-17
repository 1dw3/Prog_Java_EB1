package eb1;

import java.util.Scanner;

public class lehena {

	public static void main(String[] args) {
		// zenbaki bat irakurri eta lehena den edo ez esango du
		// aldagaiak
		int znbk;
		boolean lehena=true;
		int zati=2;
		
		//int kont=0;
		
		//Eskanerra deklaratu
		Scanner teklatua = new Scanner(System.in);
		
		//Zenbakia eskatu
		System.out.print("Sartu zenbaki bat: ");
		znbk = teklatua.nextInt();
		
		
		
		for( zati=2; ((zati<znbk)&&(lehena));zati++){
			
			
			if((znbk%zati) == 0){
				lehena = false;
			}
			zati++;
			//kont++;
			
		}
		if (lehena) {
			System.out.print("Zenbakia lehena da: ");
		}else {
			System.out.print("Zenbakia  ez da lehena: ");
		}
		//System.out.print("kontadorea: "+kont);
		teklatua.close();
		//Zatitzaileak ebatzi
		/*while ((zati < znbk)&&(lehena)){
			
			
			if((znbk%zati) == 0){
				lehena = false;
			}
			zati++;
			//kont++;
			
		}*/
		
		
		
		
		
		
		
		
		
	}

}

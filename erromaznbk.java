package ebaluaketa1;

import java.util.Scanner;
import java.math.*;

public class erromaznbk {

	public static void main(String[] args) {
		// Teklatutik zenbaki bat sartu (0-999)eta zenbaki erromatarretan jarri

		int znb;
		int digitoa, i=0, j;
		String lehen_ikurra="";
		String bigarren_ikurra="";
		String hirugarren_ikurra="";
		String erroma="";
		
		// Scanner klaseko objektu bat sortu
		Scanner teklatua = new Scanner(System.in);
			
		// znbk irakurri
		System.out.print("Sartu zenbaki osoa (0-999): ");
		znb = teklatua.nextInt();
		
		// teklatua itxi
		teklatua.close();
		
		// prozesua errepikatu digito bakoitzarentzat
		//zenbakiko hurrengo digitoa atera
		for (i=2;i>=0;i--){
			digitoa=(int) (znb/Math.pow(10, i));
			znb=(int)(znb%Math.pow(10, i));
			switch(i){
				case 2:
					lehen_ikurra="C";
					bigarren_ikurra="D";
					hirugarren_ikurra="M";
					break;
				case 1:
					lehen_ikurra="X";
					bigarren_ikurra="L";
					hirugarren_ikurra="C";
					break;
				case 0:
					lehen_ikurra="I";
					bigarren_ikurra="V";
					hirugarren_ikurra="X";
					break;
			
			}
			if (digitoa<4){
				for (j=1;j<=digitoa; j++){
					erroma=erroma+lehen_ikurra;
				}
			}
			if (digitoa==4){
				erroma=erroma+lehen_ikurra+bigarren_ikurra;
			}
			if (digitoa>4&&digitoa<9){
				erroma=erroma+bigarren_ikurra;			
				for (j=5;j<digitoa; j++){
					erroma=erroma+lehen_ikurra;
				}
			}
			if (digitoa==9){
				erroma=erroma+lehen_ikurra+hirugarren_ikurra;
			}
			
		
		}
		System.out.println (erroma);
	}

}

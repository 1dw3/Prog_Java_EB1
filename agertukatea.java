package ebaluaketa1;
//PR_1_15 AGERTUKATEA. Programa honek 	kate bat ateratzen du pantailatik
import java.util.Scanner;
public class agertukatea {
	//Metodo nagusia
	public static void main(String[] args) {
		Scanner teklatua= new Scanner(System.in);
		String katea;
		System.out.printf ("Sartu kate bat:");
		katea= teklatua.next();
		
		System.out.printf
		("Aldagaiaren balioa %s da " ,  katea);
		System.out.println();
		System.out.println ("hau da aldagaia: "+katea );
		teklatua.close();

	}

}

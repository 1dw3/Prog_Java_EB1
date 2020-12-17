package ebaluaketa1;
//PR_1_20 IRAKURRIKATEA. Programa honek 	
//kate bat teklatutik irakurri eta pantailatik ateratzen du
import java.util.Scanner;
public class irakurrikatea {
	//Metodo nagusia
	public static void main(String[] args) {
		Scanner teklatua= new Scanner(System.in);
		String katea;
		System.out.printf ("Sartu kate bat:");
		katea= teklatua.next();
		
		
		System.out.printf
		("Aldagaiaren balioa %s da " ,  katea);

		teklatua.close();

	}

}

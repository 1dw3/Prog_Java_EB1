package ebaluaketa1;
//PR_1_21 IRAKURRIKATEOSOA. Programa honek 	
//kate oso bat teklatutik irakurri eta pantailatik ateratzen du
import java.util.Scanner;
public class irakurrikateosoa {
	//Metodo nagusia
	public static void main(String[] args) {
		Scanner teklatua= new Scanner(System.in);
		String katea;
		System.out.printf ("Sartu kate bat:");
		katea= teklatua.nextLine();
		System.out.printf
		("Aldagaiaren balioa %s da " ,  katea);

		teklatua.close();

	}

}

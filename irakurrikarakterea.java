package ebaluaketa1;
//PR_1_19 IRAKURRIKARAKTEREA. Programa honek 	karaketere bat 
//irakurri eta pantailatik ateratzen du 
import java.util.Scanner;
public class irakurrikarakterea {
	//Metodo nagusia
	
	public static void main(String[] args) {
	Scanner teklatua=new Scanner (System.in);	
		char kar;// karaktereak kakotx sinpleekin kateak bikoitzekin
		System.out.println ("Sartu karaktere bat: ");
		kar=teklatua.next().charAt(0);
		System.out.printf
		("Aldagaiaren balioa %c da " ,  kar);
		teklatua.close();

	}

}

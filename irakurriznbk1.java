package ebaluaketa1;
//PR_1_23 IRAKURRIZNBK. Programa honek zenbaki oso bat hartzen du teklatutik 
// eta ateratzen du pantailatik bat gehituta
import java.util.Scanner;
public class irakurriznbk1{
	//Metodo nagusia
	public static void main(String[] args) {
		Scanner teklatua=new Scanner (System.in);
		int znbk;
		System.out.println("Ongi etorri gure aplikazioetara\n");
		System.out.println("Sartu zenbaki oso bat:");
		znbk=teklatua.nextInt();
		znbk++; // znbk=znbk+1
		System.out.printf
		("Sartutako zenbakia bat gehituta %d da %n", znbk);
		teklatua.close();
		System.out.println("\n\nEskerrik asko, ondo izan");
		

	}

}

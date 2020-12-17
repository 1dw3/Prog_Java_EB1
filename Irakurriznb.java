package eb1;
//PR_1_22 IRAKURRIZNBK. Programa honek zenbaki oso bat hartzen du teklatutik 
// eta ateratzen du pantailatik
import java.util.Scanner;
public class Irakurriznb{
	//Metodo nagusia
	public static void main(String[] args) {
		Scanner teklatua=new Scanner (System.in);
		int znbk;
		System.out.println("Sartu zenbaki oso bat");
		znbk=teklatua.nextInt();
		System.out.printf
		("Aldagaiaren balioa %d da", znbk);
		teklatua.close();
		

	}

}

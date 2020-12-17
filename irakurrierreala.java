package ebaluaketa1;
//PR_1_18 IRAKURRIERREALA. Programa honek zenbaki erreal bat 
//irakurriko du teklatutik eta pantailatik aterako du
import java.util.Scanner;
public class irakurrierreala {
	//Metodo nagusia
	public static void main(String[] args) {
		Scanner teklatua=new Scanner (System.in);
		double znbk;
		int znbk1;
		System.out.println("Sartu zenbaki bat: ");
		znbk=teklatua.nextDouble();
		System.out.printf ("Aldagaiaren balioa %.2f da", znbk);
		znbk1=(int)znbk;
		System.out.printf ("Aldagaiaren balioa %d da", znbk1);
		teklatua.close();
		
		

	}

}

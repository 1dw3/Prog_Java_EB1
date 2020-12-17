package ebaluaketa1;

import java.util.Scanner;

public class ateraznbkf {

	public static void main(String[] args) {
		// Zenbakia teklatutik irakurri eta bikoitiak atera 0tik zenbaki hortara
		// bakoitzarentzat erabiliz
		int znbk;
		int x=0;
		
		// Scanner klaseko objektua definitu
		Scanner teklatua = new Scanner(System.in);
		
		// Erabiltzailearentzat mezua
		System.out.print("Sartu zenbaki osoa positiboa: ");
		
		// lee un número entero por teclado
		znbk = teklatua.nextInt();
		
		// Teklatua itxi
		teklatua.close();
		
		
		for (x=0;x<=znbk;x=x+1){
			if (x%2==0){
				System.out.print(x + " ");
				
			}
			
		}
		
	}

}

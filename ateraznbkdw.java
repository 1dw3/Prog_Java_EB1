package ebaluaketa1;

import java.util.Scanner;

public class ateraznbkdw {

	public static void main(String[] args) {
		// Zenbakia teklatutik irakurri eta bikoitiak atera 0tik zenbaki hortara
		// Bitartean erabiliz
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
		
		
		while (x <= znbk){
			if (x%2==0){
				System.out.print(x + " ");
				
			}
			x = x +1 ;
		}
		
	}

}

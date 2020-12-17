package eb1;
//PR_2_02 BAKBIK. Programa honek, zenbaki bat bakoitia edo bikoitia den esaten du

import java.util.Scanner;

public class bakbik {
	public static void main(String[] args) {
		Scanner teklatua=new Scanner (System.in);
		double znbk;
		System.out.println("Ongi etorri gure aplikazioetara!!!");
		System.out.println("Sartu zenbaki bat bakoitia edo bikoitia den jakiteko");
		znbk=teklatua.nextDouble();
		if ((znbk % 2)==0){
			System.out.println("Zenbakia bikoitia da");
		}
		else{
			System.out.println("Zenbakia bakoitia da");
		}
		teklatua.close();
		
	}

}

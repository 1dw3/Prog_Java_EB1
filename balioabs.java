package eb1;
//PR_2_01 balioabs. Programa honek zenbaki bat hartuko du teklatutik eta pantailatik agertuko
//du bere balio absolutua
import java.util.Scanner;
public class balioabs {

	public static void main(String[] args) {
		Scanner teklatua=new Scanner (System.in);
		//double znbk;
		//double znbk1;
		int znbk;
		int znbk1;
		System.out.println("Ongi etorri gure aplikazioetara!!!");
		System.out.println("Sartu zenbaki bat bere balio absolutua emateko");
		//znbk=teklatua.nextDouble();
		znbk=teklatua.nextInt();
		//znbk1=Math.abs(znbk);
		if (znbk<0)
		  znbk1=-znbk;
		else
		  znbk1=znbk;
		 
		//System.out.printf("%.2f zenbakiaren balio absolutua %.2f da", znbk, znbk1);
		System.out.printf("%d zenbakiaren balio absolutua %d da", znbk, znbk1);
		teklatua.close();
	}

}

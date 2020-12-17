package eb1;
import java.util.Scanner;
public class Hilabeteak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner teklatua=new Scanner (System.in);
		//int hilabetea=0;
		char hilabetea='a';
		//Hilabetea eskatu
		System.out.println("Ongi etorri gure aplikazioetara!!!");
		System.out.println("Sartu hilabetearen zenbakia");
		//Hilabetea jaso
		hilabetea=teklatua.next().charAt(0);
		
		//Hilabetearen zenbakiaren arabera hilabetearen izena eman
		switch (hilabetea) {
			case 'a':
				System.out.println("Urtarrila");
				break;
			case 'b':
				System.out.println("Otsaila");
				break;
			case 3:
				System.out.println("Martxoa");
				break;
			case 4:
				System.out.println("Apirila");
				break;
			case 5:
				System.out.println("Maiatza");
				break;
			case 6:
				System.out.println("Ekaina");
				break;
			case 7:
				System.out.println("Uztaila");
				break;
			case 8:
				System.out.println("Abuztua");
				break;
			case 9:
				System.out.println("Iraila");
				break;
			case 10:
				System.out.println("Urria");
				break;
			case 11:
				System.out.println("Azaroa");
				break;
			case 12:
				System.out.println("Abendua");
				break;
			
			
			default:
				System.out.println("Ez da hilabete zenbaki egokia");
				break;
		}
		
		

	}

}

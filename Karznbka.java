package eb1;
import java.util.Scanner;
public class Karznbka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// sartuko dugu zenbaki bat
		int znbk,errenkada,zutabea, zeroak;
				
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teklatua = new Scanner(System.in);
		
		// znbk irakurri
		System.out.print("Sartu balio oso bat: ");
		znbk = teklatua.nextInt();

		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teklatua.close();
		
		// triangelua atera
		
		errenkada = 1;
		for  (errenkada=1;errenkada<=znbk;errenkada++) {
			
			for (zutabea=errenkada;zutabea<=znbk;zutabea++) {
				System.out.print(zutabea);
				System.out.print("\t");
				
			}
			for (zeroak=0;zeroak<errenkada-1;zeroak++) {
				System.out.print("0");
				System.out.print("\t");
				
			}
			
			System.out.print("\n");
			
		}
	}

}

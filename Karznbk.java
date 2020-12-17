package eb1;
import java.util.Scanner;
public class Karznbk {

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
			
			for (zeroak=0;zeroak<znbk-errenkada;zeroak++) {
				System.out.print("0");
				System.out.print("\t");
				
			}
			for (zutabea=znbk-errenkada+1;zutabea<=znbk;zutabea++) {
				System.out.print(zutabea);
				System.out.print("\t");
				
			}
			
			
			System.out.print("\n");
			
		}
	}

}

package eb1;
//PR_1_14 AGERTUERREALA. Programa honek zenbaki erreal bat ateratzen du pantailatik
public class agertuerreala{
	//Metodo nagusia
	public static void main(String[] args) {
		double znbk=3.4;
		int osoa;
		double bikoitza=2*znbk;
		double hirukoitza=3*znbk;
		int znbk1=(int)znbk;
		System.out.printf
		("Aldagaiaren balioa %d da,  bikoitza %.3f eta hirukoitza %.4f "
				,  znbk1 , 2*znbk, hirukoitza);
		System.out.println();
		System.out.println ("hau da aldagaia "+znbk + " bere bikoitza " + 
				bikoitza+ " eta bere hirukoitza "+ hirukoitza);
		osoa=(int)znbk;
		System.out.println("osoa: "+osoa);
		double hamartarra=znbk-osoa;
		System.out.println();
		System.out.println("hamartarra: "+hamartarra);

	}

}

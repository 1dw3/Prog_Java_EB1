package eb1;

public class Lehena100 {

	public static void main(String[] args) {
		
		int znbk,posizioa,ondarra;
		boolean lehena;
		int kont;
		
		//Lehen hiru zenbaki lehenak idatzi
		kont=3;
		System.out.print("1 2 3 ");
		//lehenak 5-etik aurrera
		znbk=5;
		
		// lehen 100 zenbaki lehenak
		while (kont <= 100){
			
			// lehena da
			lehena = true;
			// bakoitia baldin bada
			if((znbk%2) == 0){
				lehena = false;
			}
			else {
				//bikoitia baldin bada
				posizioa=3;
				while(posizioa < znbk){
					ondarra = znbk % posizioa;
					if (ondarra == 0){
						lehena = false;
						break;
					}
					posizioa = posizioa + 2;
				}
			}
			if (lehena){
				// lehena baldin bada
				System.out.println(znbk + " ");
				kont = kont + 1;
			}
			
			// bakarrik bikoitiak
			znbk = znbk + 2;
		}
	}

}

package ebaluaketa1;
//PR_2_14 BIMAILAEK. Programa honek bigarren mailako ekuazioa ebazten du


import java.util.Scanner;

public class bimailaek {
	public static void main(String[] args) {
		Scanner teklatua=new Scanner (System.in);
		double a, b, c, em1, em2;
		System.out.println("Ongi etorri gure aplikazioetara!!!");
		System.out.println("Sartu x2-ren koefizientea: ");
		a=teklatua.nextDouble();
		System.out.println("Sartu x-ren koefizientea: ");
		b=teklatua.nextDouble();
		System.out.println("Sartu termino independentea: ");
		c=teklatua.nextDouble();
		
		if ((Math.pow(b, 2)-4*a*c)>=0){
			em1=(-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
			em2=(-b-Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
			System.out.printf ("Ekuazioaren erroak %.2f, %.2f dira ", em1, em2);
		}
		else{
			System.out.printf ("Erro imaginarioak");	
			}
		
		teklatua.close();
		
	}

}

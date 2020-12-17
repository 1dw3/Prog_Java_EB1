package evaluacion1;

public class FactorialRecursivo {

	public static void main(String[] args) {
		// un número por teclado y calcula su factorial
		int n=5;
		int fn=factorial(n);
		
		System.out.print("Factorial = " + fn);
	}
	static int factorial(int n){
    if(n==0){
    	return 1;   // Caso Base
    }
    else{
    	return (n*factorial(n-1));  // Caso General
    }
 }
}

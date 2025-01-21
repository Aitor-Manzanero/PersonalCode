package repetidosMAtricesFunciones;

import java.util.Scanner;

public class RecursividadFactorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número entero positivo");
		int num = sc.nextInt();
		System.out.println("El factorial de " + num + " es igual a " + factorial(num));
	}
	
	public static int factorial (int numero) {
		if (numero == 0) {
			return 1;
		}
		
		else {
			return numero*factorial(numero-1);
		}
	}	

}

package repetidosMAtricesFunciones;

import java.util.Scanner;

public class RecursividadSumaDigitos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número para sumar sus cifras");
		int num = sc.nextInt();
		sumaCifras(num);
	}
	
	public static void sumaCifras(int a) {
		
		
		if (a < 9) {
			System.out.println("+ " + a + " =");
		}
		
		else if (a > 9) {
			System.out.print(a / 10 + " ");
			sumaCifras(a%10);
		}
	}

}

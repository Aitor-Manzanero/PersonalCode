package repetidosMAtricesFunciones;

import java.util.Scanner;

public class FuncionNumeroMenor {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce un número");
		int num1 = sc.nextInt();
		System.out.println("Introduce otro número");
		int num2 = sc.nextInt();
		System.out.println(minimo(num1, num2));
	}
	
	public static int minimo (int a, int b) {
		if (a < b) {
			return a;
		}
		
		else {
			return b;
		}
	}

}

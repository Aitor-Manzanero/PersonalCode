package repetidosMAtricesFunciones;

import java.util.Scanner;

public class FuncionPositivo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número");
		int num = sc.nextInt();
		
		if (dimeSigno(num) == 1) {
			System.out.println("Es positivo");
		}
		
		else if (dimeSigno(num) == -1) {
			System.out.println("Es negativo");

		}
		
		else {
			System.out.println("Es igual a 0");
		}
		
	}
	
	public static int dimeSigno (int a) {
		
		if (a > 0) {
			return 1;
		}
		
		else if (a < 0) {
			return -1;
		}
		
		else {
			return 0;
		}
	}

}

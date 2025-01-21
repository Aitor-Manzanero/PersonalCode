package repetidosMAtricesFunciones;

import java.util.Scanner;

public class FuncionPrimoNo {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int num;
		
		do  {
			System.out.println("Introduce un número. Introduce 0 para salir del programa");
			num = sc.nextInt();
			
			if (num == 0) {
				break;
			}
			
			if (esPrimo(num)) {
				System.out.println("Es primo");
			}
			else {
				System.out.println("No es primo");
			}
			
		}while (num != 0);
	
	}
	
	public static boolean esPrimo (int num) {
		
		if (num < 2) {
			return false;
		}
		
		for (int i = 2; i < num/2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		
		return true;
	
	}

}

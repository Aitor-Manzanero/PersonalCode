package repetidosMAtricesFunciones;

import java.util.Scanner;

public class RecursividadAscendentes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número mayor o igual que 1");
		int num = sc.nextInt();
		ascendente(num);
	}
	
	public static void ascendente(int a) {
		if (a == 1) {
			System.out.println(a);
		}
		
		else if (a > 1) {
			ascendente(a-1);
			System.out.println(a);
		}
		
		else {
			System.out.println("Número no válido");
		}
	}

}

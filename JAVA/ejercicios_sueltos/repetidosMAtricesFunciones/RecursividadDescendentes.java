package repetidosMAtricesFunciones;

import java.util.Scanner;

public class RecursividadDescendentes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número mayor que 0");
		int num = sc.nextInt();
		descendente(num);
	}
	
	public static void descendente(int a) {
		if (a >= 1) {
			System.out.println(a);
			descendente (a-1);
		}
	}
}	
	


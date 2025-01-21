package repetidosMAtricesFunciones;

import java.util.Scanner;

public class FuncionPitagoras {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el valor de x :");
		int x = sc.nextInt();
		System.out.println("Introduce el valor de y :");
		int y = sc.nextInt();
		System.out.println("Introduce el valor de z :");
		int z = sc.nextInt();
		
		if (pitagoras (x,y,z)) {
			System.out.println("Cumple con la ecuación de Pitágoras.");
		}
		
		else {
			System.out.println("No cumple con la ecuación de Pitágoras");
		}
	}
	
	public static boolean pitagoras (int x, int y, int z) {
		
		if ((x*x)+(y*y) == (z*z)) {
			return true;
		}
		
		else {
			return false;
		}
	}

}

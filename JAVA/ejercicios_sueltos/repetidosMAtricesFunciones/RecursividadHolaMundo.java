package repetidosMAtricesFunciones;

import java.util.Scanner;

public class RecursividadHolaMundo {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Introduce cuántas veces quieres que escriba hola mundo ");
		int repeticiones = sc.nextInt();
		holaMundo(repeticiones);
		
	}
	
	public static void holaMundo(int a) {
		
		if (a >= 1) {
			System.out.println("Hola mundo");
			holaMundo (a-1);
		}
		
		else if ( a < 0) {
			System.out.println("Roboto triste :(");
		}
		
	}

}

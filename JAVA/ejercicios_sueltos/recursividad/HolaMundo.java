/* Escribir un programa que escriba tantos "hola mundo" como nos pidan. */

package recursividad;

import java.util.Scanner;

public class HolaMundo {

	public static void holaMundo (int repeticiones)
	{
		if (repeticiones >= 1){
			System.out.println("hola mundo");
			holaMundo(repeticiones-1);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuántas veces quieres que el programa escriba?");
		int repeticiones = sc.nextInt();
		holaMundo (repeticiones);
	}

}

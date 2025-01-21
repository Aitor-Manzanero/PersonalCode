/* Crea una función que reciba los parámetros N, M y num.
Debe devolver si num está o no entre N y M (ambos incluidos) */

package repasoEvaluacionDos;

import java.util.Scanner;

public class EntreNyM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el valor mínimo.");
		int n = sc.nextInt();
		System.out.println("Introduce el valor máximo.");
		int m = sc.nextInt();
		System.out.println("Introduce el número a comprobar");
		int num = sc.nextInt();
		boolean comprendido = comprendido (n, m, num);
		if (comprendido) {
			System.out.println("Está comprendido entre el mínimo y el máximo");
		}
		else {
			System.out.println("No está comprendido entre el mínimo y el máximo");
		}
	}
	
	public static boolean comprendido (int n, int m, int num) {
		if (num < n | num > m)  {
			return false;
		}
		else {
			return true;
		}
	}

}

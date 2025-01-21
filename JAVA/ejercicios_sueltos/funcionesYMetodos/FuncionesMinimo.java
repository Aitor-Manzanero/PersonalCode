/* Escribe un programa que pida dos números enteros por teclado y muestre por pantalla cual es el mínimo. 
 * Implementa y utiliza la función: int minimo(int a, int b) // Devuelve el menor entre a y b */

package funcionesYMetodos;

import java.util.Scanner;

public class FuncionesMinimo {

	public static int minimo (int a, int b)
	{
		if (a>b)
		{
			return b;
		}
		else
		{
			return a;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce un número");
		int num1 = sc.nextInt();
		System.out.println("Introduce otro número");
		int num2 = sc.nextInt();
		
		System.out.println(minimo (num1, num2));
	}

}

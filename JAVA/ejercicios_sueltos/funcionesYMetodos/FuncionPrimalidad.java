/* Realiza un programa que nos pida número enteros hasta que se introduzca el 0, diciéndonos, para cada número 
introducido si es primo o no. Hay que recordar que un número es primo si es divisible por si mismo y por 1. El 1 no es 
primo por convenio. Se debe crear una función que pasándole un número entero devuelva si es primo o no. */

package funcionesYMetodos;

import java.util.Scanner;

public class FuncionPrimalidad {

	public static boolean primalidad (int numero)
	{
		if (numero < 2) {
			return false;
		}
		
			for (int i = 2; i <= numero/2; i++)
			{
				if (numero % i == 0) {
					return false;
				}	
			}
			
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		do {
			System.out.println("Introduce un número natural. Introduce 0 para salir.");
			num = sc.nextInt();
			if (num == 0) {
				break;
			}
			
			if (primalidad(num)) {
				System.out.println("Es primo");
			}
			else {
				System.out.println("No es primo");
			}
		} while (num != 0);
	
		
	}

}

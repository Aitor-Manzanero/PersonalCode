/* Escribe un programa que pida dos números reales por teclado y muestre por pantalla el resultado
de multiplicarlos. Implementa y utiliza la función:
double multiplica(double a, double b) // Devuelve la multiplicación de dos números */

package funcionesYMetodos;

import java.util.Scanner;

public class FuncionMultiplica {

	public static double multiplica(double a, double b)
	{
		return a*b;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce el valor del multiplicador");
		double multiplicador = sc.nextDouble();
		System.out.println("Introduce el valor del multiplicando");
		double multiplicando = sc.nextDouble();
		// double resultado = multiplica (multiplicador, multiplicando); 	No es una linea necesaria
		System.out.println(multiplica(multiplicador,multiplicando));
	}

}

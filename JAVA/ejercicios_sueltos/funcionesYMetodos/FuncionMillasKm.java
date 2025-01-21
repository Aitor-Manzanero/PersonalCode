/* Escribe un programa que pida un valor entero en millas y muestre su equivalente en kilómetros. 
Recuerda que una milla son 1,60934 kilómetros. Implementa y utiliza la función:
double millas_a_kilometros(int millas) // Devuelve la conversión de millas a kilómetros */

package funcionesYMetodos;

import java.util.Scanner;

public class FuncionMillasKm {

	public static double millas_a_kilometros (int millas)
	{
		final double km=1.60934;
		return millas*km;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce el valor en millas: ");
		int millas = sc.nextInt();
		System.out.println(millas_a_kilometros(millas));
	}

}

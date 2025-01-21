/* Realiza un programa que dado un valor en kilómetros nos lo traduce a millas. El programa debe tener una función 
que reciba como parámetro una cantidad en kilómetros y nos la devuelva en millas. */

package funcionesYMetodos;

import java.util.Scanner;

public class FuncionKmMilla {

	public static double aMillas (double km)
	{
		final double milla = 0.621371;
		return km * milla;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce los kilómetros: ");
		double km =sc.nextDouble();
		double millas = aMillas (km);
		System.out.println(millas);
	}

}

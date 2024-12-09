/*12 Realiza un programa que dado un valor en kilómetros nos lo traduce a millas. El programa debe tener una función 
que reciba como parámetro una cantidad en kilómetros y nos la devuelva en millas. */

package funciones;
import java.util.Scanner;
public class Funciones_km_a_millas {

	public static double aMillas(double km)	//Convierte Kms a Millas
	{
		final double conversion=0.621371;	//Constante de conversión
		double millas=km*conversion;
		return millas;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce la cantidad de kilómetros");
		double km=sc.nextDouble();
		double millas=aMillas(km);
		System.out.println(km + " kilómetros equivalen a " + millas + " millas");
	}

}
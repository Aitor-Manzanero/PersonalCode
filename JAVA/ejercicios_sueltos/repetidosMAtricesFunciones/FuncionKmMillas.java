package repetidosMAtricesFunciones;

import java.util.Scanner;

public class FuncionKmMillas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce los kilómetros: ");
		double km = sc.nextDouble();
		
		System.out.println(kmMillas(km));
	}
	
	public static double kmMillas (double km) {
		
		final double aMillas = 0.621371;
		return km*aMillas;
	}

}

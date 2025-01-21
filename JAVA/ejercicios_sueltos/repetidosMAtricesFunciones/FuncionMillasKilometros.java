package repetidosMAtricesFunciones;

import java.util.Scanner;

public class FuncionMillasKilometros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el valor en millas");	
		int millas = sc.nextInt();
		System.out.println(millas_a_kilometros(millas));
	}
	
	public static double millas_a_kilometros(int millas) {
		final double equivalencia = 1.60934;
		return millas * equivalencia;
	}

}

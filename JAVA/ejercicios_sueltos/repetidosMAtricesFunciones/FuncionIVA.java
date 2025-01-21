package repetidosMAtricesFunciones;

import java.util.Scanner;

public class FuncionIVA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Introduce el precio sin IVA: ");
			double precioSin = sc.nextDouble();
			System.out.println("El precio con IVA del producto es de: " + precioConIVA(precioSin));
		}
	}
	
	public static double precioConIVA (double precio) {
		final double IVA = 1.21;
		return precio * IVA;
	}

}

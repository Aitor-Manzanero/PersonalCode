package repetidosMAtricesFunciones;

import java.util.Scanner;

public class FuncionMultiplica {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer número: ");
		double num1 = sc.nextDouble();
		System.out.println("Introduce el segundo número: ");
		double num2 = sc.nextDouble();
		System.out.println(multiplica(num1, num2));
	}
	
	public static double multiplica(double a, double b) {
		return a*b;
	}

}

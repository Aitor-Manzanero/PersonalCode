package repetidosMAtricesFunciones;

import java.util.Scanner;

public class FuncionEdad {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la edad: ");
		int edad = sc.nextInt();
		boolean adulto = esMayorEdad(edad);
		if (adulto == true) {
			System.out.println("Es mayor de edad");
		}
		else {
			System.out.println("No es mayor de edad");
		}
	}
	
	public static boolean esMayorEdad (int a) {
		if (a >= 18) {
			return true;
		}
		else {
			return false;
		}
	}

}

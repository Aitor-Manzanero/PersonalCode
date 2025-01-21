package repetidosMAtricesFunciones;

import java.util.Scanner;

public class FuncionParImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número");
		int num = sc.nextInt();
		esPar(num);
	}
	
	public static void esPar(int numero) {
		if (numero % 2 == 0) {
			System.out.println("El número es par");
		}
		else {
			System.out.println("El número no es par");
		}
	}

}

/* Crea una función que reciba como parámetro un número y muestre por pantalla si es par o impar. */



package repasoEvaluacionDos;

import java.util.Scanner;

public class ParOImpar {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número");
		int num = sc.nextInt();
		parImpar(num);
	}
	
	public static void parImpar (int numero) {	//Podría usarse un boolean.
		if (numero % 2 == 0) {
			System.out.println("El número es par.");
		}
		else {
			System.out.println("El número es impar");
		}
	}
	

}

/* Implementar un procedimiento recursivo que reciba un número entero mayor o igual que 1 y
muestre todos los números en orden ascendente partiendo del número 1 y terminando en el número recibido. */

package recursividad;

import java.util.Scanner;

public class NumerosAscendentes {

	public static void ascendentes (int numero) {
		
		if (numero == 1) {
			System.out.print(numero + " ");
		}
		else {
			ascendentes (numero -1);
			System.out.print(numero + " ");		// Se imprime después porque antes llama de nuevo a la función.
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce hasta qué número quieres que se muestre");
		int numMax = sc.nextInt();
		ascendentes (numMax);
	}

}

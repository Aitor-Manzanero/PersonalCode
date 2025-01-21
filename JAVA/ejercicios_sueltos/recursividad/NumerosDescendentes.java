/* Implementar un procedimiento recursivo que reciba un número entero mayor o igual que 1 y
muestre todos los números en orden descendente partiendo del número recibido y terminando en 1. */

package recursividad;

import java.util.Scanner;

public class NumerosDescendentes {

	public static void UnoaN ( int numero) {
		if (numero >= 1) {
			System.out.println(numero);
			UnoaN (numero - 1);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Desde qué número quieres que se muestre?");
		int numMax = sc.nextInt();
		UnoaN (numMax);
	}

}

/* 4- Escribe un programa que pida un número entero por teclado y muestre por pantalla si es positivo, negativo o cero. Implementa y utiliza la función:
	int dimeSigno(int a) // Devuelve -1 si es negativo, 0 si es igual a 0, 1 si es positivo */

package funcionesYMetodos;

import java.util.Scanner;

public class FuncionPositivoNegativo {

	public static int dimeSigno (int a)
	{
		if (a > 0) {
			return 1;
		}
		else if (a < 0) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce un número entero: ");
		int num = sc.nextInt();
		int resultado = dimeSigno (num);
		if (resultado==1) {
			System.out.println("Es positivo.");
		}
		else if (resultado==-1) {
			System.out.println("Es negativo.");
		}
		else {
			System.out.println("Es cero");
		}
	}

}

/* Escribe un programa que cree un array del tamaño indicado por teclado y luego lo rellene con
valores aleatorios (utiliza Math.random()). Implementa la función que rellena un array con valores
aleatorios */

package funcionesYMetodos;

import java.util.Arrays;
import java.util.Scanner;

public class FuncionArray {

	
	public static double [] rellenarArray (int n)
	{
		double [] rellenarArray = new double [n];
		
		for (int i = 0; i <n; i++)
		{
			rellenarArray[i] = Math.random();
		}
		
		return rellenarArray;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuántos valores quieres guardar en el array?: ");
		int n = sc.nextInt();
		System.out.println(Arrays.toString(rellenarArray(n)));
	}

}

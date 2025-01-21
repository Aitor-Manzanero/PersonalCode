/* Escribe un programa que imprima las tablas de multiplicar del 1 al 10. Implementa una función
que reciba un número entero como parámetro e imprima su tabla de multiplicar.  */

package funcionesYMetodos;

import java.util.Arrays;
import java.util.Scanner;

public class FuncionTablaMultiplicar {

	public static int[] tablaMultiplicar (int multiplicador)
	{
		int [] tabla = new int [10];
		for (int i = 0; i < tabla.length; i++)
		{
			tabla[i] = multiplicador*(i+1);
		}
		return tabla;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número entero: ");
		int num = sc.nextInt();
		int [] tabla = tablaMultiplicar (num);
		
		System.out.println(Arrays.toString(tabla));
	}

}

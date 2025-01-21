/* Crea un programa que pida dos valores enteros N y M, luego cree un array de tamaño N,
escriba M en todas sus posiciones y lo muestre por pantalla */

package array;

import java.util.Scanner;

public class TamanioN {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Introduce el tamaño del array.");
		int N=sc.nextInt();
		System.out.println("Introduce el valor que quieres que contenga en array");
		int M=sc.nextInt();
		int[] array=new int[N];
		
		for (int i=0; i<N; i++)
		{
			array[i]=M;
			System.out.print(array[i] + " ");
		}
	}

}

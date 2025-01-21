/* Crea un programa que pida la usuario dos valores N y M y luego cree un array de tamaño N
que contenga M en todas sus posiciones. Luego muestra el array por pantalla. */

package metodosArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayNaM {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce el tamaño del array.");
		int N=sc.nextInt();
		System.out.println("Introduce el valor.");
		int M=sc.nextInt();
		int [] array=new int[N];
		Arrays.fill(array, M);
		System.out.println(Arrays.toString(array));
	}
}

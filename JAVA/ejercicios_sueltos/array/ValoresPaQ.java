/* Crea un programa que pida dos valores enteros P y Q, luego cree un array que contenga todos
los valores desde P hasta Q, y lo muestre por pantalla. */

package array;

import java.util.Scanner;

public class ValoresPaQ {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce el valor más bajo");
		int P=sc.nextInt();
		System.out.println("Introduce el valor más alto");
		int Q=sc.nextInt();
		int[] array=new int[(Q-P)+1];
		
		for (int i=0; i<array.length; i++)
		{
			array[i]=P+i;
			System.out.print(array[i] + " ");
		}
	}

}

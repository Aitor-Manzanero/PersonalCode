/* Crea un programa que pida veinte números enteros por teclado, los almacene en un array y
luego muestre por separado la suma de todos los valores positivos y negativos. */

package array;

import java.util.Scanner;

public class SumaPositivosNegativos {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] array=new int[20];
		
		for (int i=0; i<array.length ; i++)
		{
			System.out.println("Introduce el entero que se almacenará en la posición " + i);
			array[i]=sc.nextInt();
		}
		
		int sumaPositivos=0;
		int sumaNegativos=0;
		
		for (int i=0; i<array.length; i++)
		{
			if (array[i]>0)
			{
				sumaPositivos+=array[i];
			}
			
			else
			{
				sumaNegativos+=array[i];
			}
		}
		
		System.out.println("La suma de los positivos es de " + sumaPositivos + " y la suma de los negativos es de " + sumaNegativos);
	}

}

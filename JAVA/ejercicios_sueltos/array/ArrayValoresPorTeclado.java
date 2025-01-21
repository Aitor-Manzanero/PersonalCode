/* Crea un programa que pida diez números reales por teclado, los almacene en un array, y luego
muestre todos sus valores. */

package array;

import java.util.Scanner;

public class ArrayValoresPorTeclado {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		double [] array = new double[10];
	
		for (int i=0 ; i<array.length; i++)
		{
			System.out.println("Introduce el valor que se almacenará en la posición " + i);
			array[i]=sc.nextDouble();
		}
		
		for (int i=0 ; i<array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
			
	}

}

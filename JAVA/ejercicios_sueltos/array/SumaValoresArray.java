/* Crea un programa que pida diez números reales por teclado, los almacene en un array, y luego
muestre la suma de todos los valores. */

package array;

import java.util.Scanner;

public class SumaValoresArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		double suma=0;
		double [] array= new double[10];
		
		for (int i=0; i<array.length; i++)
		{
			System.out.println("Introduce el valor que se almacenará en la posición " + i);
			array[i]=sc.nextDouble();
			suma+=array[i];
		}
		
		System.out.println(suma);
	}

}

/* Crea un programa que pida diez números reales por teclado, los almacene en un array, y luego
lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla. */

package array;

import java.util.Scanner;

public class ValorMinimoMaximo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double [] array = new double [10];
		double min=0;
		double max=0;
		
		for (int i=0; i<array.length; i++)
		{
			System.out.println("Introduce el valor para la posición " + i);
			array[i]=sc.nextDouble();
			
			if (i==0)
			{
				min=array[i];
				max=array[i];
			}
			
			else if (array[i]<min)
			{
				min=array[i];
			}
			
			else if (array[i]>max)
			{
				max=array[i];
			}
		}
		//Aquí podríamos hacer que recorra el array nuevamente para cumplir explicitamente con el enunciado pero no es necesario
		System.out.println("El valor mínimo es " + min + " y el valor máximo es " + max);
	
	}

}

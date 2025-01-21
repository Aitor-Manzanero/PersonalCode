/*^Crea un programa que pida veinte números reales por teclado, los almacene en un array y
luego lo recorra para calcular y mostrar la media: (suma de valores) / nº de valores. */

package array;

import java.util.Scanner;

public class mediaValores {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		double [] array=new double[5];
		double suma=0;
		
		for (int i=0; i<array.length; i++)
		{
			System.out.println("Introduce el número que se almacenará en la posición " + i);
			array[i]=sc.nextDouble();
			suma+=array[i];
			if(i==array.length-1)
			{
				System.out.println("La media es igual a " + suma/(i+1));
			}
		}
		

	}

}

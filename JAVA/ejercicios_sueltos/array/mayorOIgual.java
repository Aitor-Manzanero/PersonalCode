/* Cr0,7ea un programa que cree un array con 100 números reales aleatorios entre 0.0 y 1.0,
utilizando Math.random(), y luego le pida al usuario un valor real R. Por último, mostrará
cuántos valores del array son igual o superiores a R. */


package array;

import java.util.Scanner;

public class mayorOIgual {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double[]array=new double[100];
		System.out.println("Introduce un número real, del 0 al 1");
		double R=sc.nextDouble();
		int cont=0;
		
		for (int i=0; i<array.length; i++)
		{
			array[i]=Math.random();
			if (array[i]>=R)
			{
				cont++;
			}
		}
		System.out.println(cont + " son los valores igual o superiores al número introducido");
		
	}

}

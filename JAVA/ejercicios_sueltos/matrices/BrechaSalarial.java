/* Necesitamos crear un programa para registrar sueldos de hombres y mujeres de una empresa
y detectar si existe brecha salarial entre ambos. El programa pedirá por teclado la información
de N personas distintas (valor también introducido por teclado). Para cada persona, pedirá su
género (0 para varón y 1 para mujer) y su sueldo. Esta información debe guardarse en una matriz. 
Luego se guardará por pantalla el sueldo medio de cada género. */

package matrices;

import java.util.Scanner;

public class BrechaSalarial {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Dime el número de personas");
		int personas = sc.nextInt();
		int [][] sueldos = new int [personas][2];
		int nvarones = 0;
		int nmujeres = 0;
		int sumavarones = 0;
		int sumamujeres = 0;
		
		for (int i = 0; i < sueldos.length; i++)
		{
			for (int j = 0; j < sueldos[i].length; j++)
			{
				if (j==0)
				{
					System.out.println("Introduce el género del empleado nº " + (i+1));
					sueldos[i][j]=sc.nextInt();
				}
				else
				{
					System.out.println("Introduce el sueldo del empleado nº " + (i+1));
					sueldos[i][j]=sc.nextInt();
				}
			}
		}
		
		for (int i = 0; i < sueldos.length; i++)
		{
			for (int j = 0; j < sueldos[i].length; j++)
			{
				if (sueldos[i][0]==0)
				{
					nvarones++;
					sumavarones+=sueldos[i][1];
				}
				else
				{
					nmujeres++;
					sumamujeres+=sueldos[i][1];
				}
			}
		}
		
		 System.out.println("El sueldo medio de los varones es: " + (sumavarones / nvarones));
	      System.out.println("El sueldo medio de las mujeres es: " + (sumamujeres / nmujeres));
	}

}

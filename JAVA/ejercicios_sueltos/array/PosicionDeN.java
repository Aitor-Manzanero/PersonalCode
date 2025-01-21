/* Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores enteros
aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego pedirá un valor N y mostrará en
qué posiciones del array aparece N */

package array;

import java.util.Scanner;

public class PosicionDeN {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int [] array = new int[100];
		
		for (int i=0; i<array.length; i++)
		{
			array[i]=(int) (1+Math.random()*10);
		}
		
		System.out.println("Introduce el valor que quieres buscar");
		int valor=sc.nextInt();
		
		for (int i=0; i<array.length; i++)
		{
			if (valor==array[i])
			{
				System.out.print(i + " ");
			}
		}
	}

}

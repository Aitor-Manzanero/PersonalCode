/* Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de valores:
1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces, y luego la muestre por
pantalla. */

package array;

public class RellenarCadaVezMas {

	public static void main(String[] args) {
		int n = 10;
		int [] array = new int [(n*(n+1))/2];
		int index=0;
		
		for (int i = 1; i <= n; i++)
		{
			for (int j = 0; j < i; j++)
			{
				array[index]=i;
				System.out.print(array[index] + " ");
				index++;
				
			}
		}
		
	}

}

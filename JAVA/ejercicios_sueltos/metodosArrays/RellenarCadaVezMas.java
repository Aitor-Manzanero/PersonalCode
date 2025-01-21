/* Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de valores:
1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces, y luego la muestre por
pantalla. En esta ocasión has de utilizar Arrays.fill(). */

package metodosArrays;

import java.util.Arrays;

public class RellenarCadaVezMas {

	public static void main(String[] args) {
		int valorMax = 10;
		int tamanio = (valorMax*(valorMax+1))/2;
		int [] array = new int[tamanio];
		int index = 0;
		
		for (int i = 1; i <= valorMax; i++)
		{
			Arrays.fill(array,index, index + i, i);
			index += i;
		}
		
		System.out.println(Arrays.toString(array));
	}

}

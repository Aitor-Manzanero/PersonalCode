/* Dado el array unidimensional de enteros (por ejemplo {4,1,4,6,3,1,8,6,8,2,7,9,2,1,1,6,8,6,4,7,9,0,1,3})  
transformarlo  en un array bidimensional donde cada cuatro elementos del  primer array 
unidimensional forman una fila del segundo.  */

package matrices;

import java.util.Arrays;

public class ArrayAMatriz {

	public static void main(String[] args) {
		int [] array = {4,1,4,6,3,1,8,6,8,2,7,9,2,1,1,6,8,6,4,7,9,0,1,3};
		int [][] matriz = new int [array.length/4][4];
		int cont = 0;
		
		for (int i = 0; i < matriz.length; i++)
		{
			for (int j = 0; j < matriz[i].length; j++)
			{
				matriz[i][j]=array[cont];
				cont++;
			}
		}
		
		System.out.println(Arrays.deepToString(matriz));
	}

}

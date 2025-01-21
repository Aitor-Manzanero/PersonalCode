/*  Dada la matriz bidimensional {{2,5,7},{1,6,6},{1,1,1},{6,8,5},{3,6,4},{1,8,5}}   
obtener una matriz con la mitad de filas donde cada nueva  fila sea la suma de dos filas consecutivas. 
(fila 0 + fila 1, fila 2  + fila 3, etc…)  */

package matrices;

import java.util.Arrays;

public class MatrizSumaDeOtra {

	public static void main(String[] args) {
		int [][] matrizInicial = {{2,5,7},{1,6,6},{1,1,1},{6,8,5},{3,6,4},{1,8,5}};
		int [][] matrizFinal = new int [matrizInicial.length/2][matrizInicial[0].length];
		
		for (int i = 0; i < matrizFinal.length; i++)
		{
			for (int j = 0; j < matrizInicial[i].length; j++)
			{
				{
					matrizFinal[i][j] = matrizInicial[2*i][j] + matrizInicial[2*i+1][j];
				}
			}
		}
		
		System.out.println(Arrays.deepToString(matrizFinal));
	}

}

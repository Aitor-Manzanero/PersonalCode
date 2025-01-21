/*Sumar los elementos de las matrices cuando la suma de las dos posiciones de cada elemento sea  par. */

package matrices;

import java.util.Scanner;

public class SumaPosicionesPares {

	public static void main(String[] args) {
		int [][] matriz1 = {{3,6,8,5}, {4,7,1,9}};
		int [][] matriz2= {{2,5,6,3}, {7,-7,3,4}};
		int [][] matrizSuma = new int [matriz1.length][matriz1[0].length];
		
		for (int i = 0; i < matriz1.length; i++)
		{
			for (int j = 0; j < matriz1[i].length; j++)
			{
				if ((matriz1[i][j] + matriz2[i][j]) % 2 == 0)
				{
					matrizSuma[i][j] = matriz1[i][j] + matriz2[i][j];
				}
			}
		}
		
		for (int i = 0; i < matriz1.length; i++)
		{
			for (int j = 0; j < matriz1[i].length; j++)
			{
				System.out.print(matrizSuma[i][j] + " ");	

			}
		}
		
		// Se podría imprimir con Arrays.deepToString(matrizSuma);
	}

}

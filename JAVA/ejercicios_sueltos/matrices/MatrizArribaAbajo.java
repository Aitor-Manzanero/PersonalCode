/* Invertir una matriz de modo que todos los elementos de la fila de abajo pasen a estar arriba y viceversa. Mostrar las dos matrices.
Probarlo con:
{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}} */

package matrices;

import java.util.Arrays;

public class MatrizArribaAbajo {

	public static void main(String[] args) {
		int [][] matriz1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
		int [][] matriz2 = new int [matriz1.length][matriz1[0].length]; 
		
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1[i].length; j++) {
				matriz2[i][j] = matriz1[matriz1.length - 1 - i][j];
			}
		}
		
		System.out.println(Arrays.deepToString(matriz2));
	}

}

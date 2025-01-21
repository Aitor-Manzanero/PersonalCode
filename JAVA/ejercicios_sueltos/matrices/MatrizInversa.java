/* Invertir una matriz de modo que todos los elementos de la derecha pasen a estar a la izquierda y viceversa. Mostrar las dos matrices.
Probarlo con:
{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}} */

package matrices;

import java.util.Arrays;

public class MatrizInversa {

	public static void main(String[] args) {
		int [][] matriz1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
		int [][] matriz2 = new int [matriz1.length][matriz1[0].length];
		
		for (int i = 0; i < matriz1.length; i++) {
			int cont = matriz1[i].length-1;
			for (int j = 0; j < matriz1[i].length; j++) {
				matriz2[i][cont]=matriz1[i][j];
				cont--;
			}
		}
		
		System.out.println(Arrays.deepToString(matriz2));
	}

}

/* Dada una matriz cuadrada obtener cual es la suma de  todos los elementos que componen las dos diagonales.  

Probarlo con:
{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19, 20},{21,22,23,24,25}}  */

package matrices;

public class SumarDiagonales {

	public static void main(String[] args) {
		int [][] matriz = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19, 20},{21,22,23,24,25}};
		int sumaDiagonales = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (i == j | i + j == 4)
				{
					System.out.println(matriz[i][j]);
					sumaDiagonales += matriz[i][j];
				}
			}
		}
		System.out.println(sumaDiagonales);
	}

}

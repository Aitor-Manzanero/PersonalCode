/* Hacer un programa Java, que:

Crea una matriz de 10x10 (filas x columnas) y nombre 'tabla'.
Carga la matriz de manera que las filas pares se rellenan con 1 y las filas impares con 0. 
Una vez inicializada la matriz muestra su contenido en pantalla. */

package matrices;

import java.util.Arrays;

public class Pares1Impares0 {

	public static void main(String[] args) {
		int [][] matriz = new int [10][10];
		
		//Se parte de: la primera fila es la 0, y que este es par aunque no lo sea realmente.
		
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz.length; j++) {
				if (i % 2 == 0) {
					matriz[i][j] = 1;
				}
				else {
					matriz[i][j] = 0;
				}
			}
		}
		
		System.out.print(Arrays.deepToString(matriz));
		
		
	}

}

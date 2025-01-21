/* Diseñar programa Java, que: 
Crea una tabla bidimensional de longitud 3x3 y nombre 'matriz'. 
Carga la tabla con valores numéricos enteros introducidos por teclado
Obtiene la matriz traspuesta (filas X columnas) guardando valores en nueva matriz llamada “matrizT”
Muestra ambas matrices por pantalla */

package matrices;

import java.util.Arrays;
import java.util.Scanner;

public class MatrizTraspuesta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [][] matriz = new int [3][3];
		int [][] matrizT = new int [3][3];
		
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz.length; j++) {
				System.out.println("Introduce el valor guardado en la fila " + i + " columna " + j);
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(Arrays.deepToString(matriz)); // Comprobar la matriz.
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matrizT[i][j] = matriz [j][i];
			}
		}
		
		System.out.println(Arrays.deepToString(matrizT));
	}

}

/* Crea un programa que administre un array bidimensional de 5 filas, pero irregular :
la primera fila tendrá  una columna
la segunda fila  tendrá dos columnas
y así sucesivamente hasta que la última fila tenga cinco columnas.
Realiza  la carga de datos por teclado e imprime posteriormente los valores del array. */
package matrices;

import java.util.Arrays;
import java.util.Scanner;

public class MatrizIrregular {

	public static void main(String[] args) {
		int [][] matrizIrregular = new int [5][];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < matrizIrregular.length; i++)
		{
			matrizIrregular[i] = new int [i + 1];	// Para añadir las columnas
		}
		
		for ( int i = 0; i < matrizIrregular.length; i++) {
			for ( int j = 0; j < matrizIrregular[i].length; j++) {
				System.out.println("Introduce el valor de la fila "+ i + " columna " + j);
				matrizIrregular[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(Arrays.deepToString(matrizIrregular));
	}

}

package repetidosMAtricesFunciones;

import java.util.Arrays;
import java.util.Scanner;

public class MatrizTraspuesta {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int [][] matrizI = new int [3][3];
		int [][] matrizF = new int [3][3];
		
		for (int i = 0; i < matrizI.length; i++) {
			
			for (int j = 0; j < matrizI[i].length; j++) {
				System.out.println("Introduce el valor de la fila " + 1 + " columna " + j);
				matrizI[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(Arrays.deepToString(matrizI));
		
		for (int i = 0; i < matrizF.length; i++) {
			
			for (int j = 0; j < matrizF[i].length; j++) {
				matrizF[i][j] = matrizI[j][i];
			}
		}
		
		System.out.println(Arrays.deepToString(matrizF));
		
	}

}

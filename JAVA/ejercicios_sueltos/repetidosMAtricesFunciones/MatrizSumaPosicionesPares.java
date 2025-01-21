package repetidosMAtricesFunciones;

import java.util.Arrays;

public class MatrizSumaPosicionesPares {

	public static void main(String[] args) {
		int [][] matriz1 = {{3,6,8,5}, {4,7,1,9}};
		int [][] matriz2 = {{2,5,6,3}, {7,-7,3,4}};
		int [][] matrizFinal = new int [matriz1.length][matriz1[0].length];
		
		for (int i = 0; i < matrizFinal.length; i++) {
			
			for (int j = 0; j < matrizFinal[i].length; j++) {
				if ((matriz1[i][j] + matriz2[i][j]) % 2 == 0) {
					matrizFinal[i][j] = matriz1[i][j] + matriz2[i][j];
				}
			}
		}
		
		System.out.println(Arrays.deepToString(matrizFinal));
	}

}

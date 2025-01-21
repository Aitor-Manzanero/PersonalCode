package repetidosMAtricesFunciones;

import java.util.Arrays;

public class MatrizArribaAbajo {

	public static void main(String[] args) {
		int [][] matrizI = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
		int [][] matrizF = new int [matrizI.length][matrizI[0].length];
		
		for (int i = 0; i < matrizF.length; i++) {
			
			for (int j = 0; j < matrizF[i].length; j++) {
				matrizF[i][j] = matrizI [matrizI.length-i-1][j];
			}
		}
		
		System.out.println(Arrays.deepToString(matrizF));
	}

}

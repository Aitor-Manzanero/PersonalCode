package repetidosMAtricesFunciones;

import java.util.Arrays;

public class MatrizSumaFilas {

	public static void main(String[] args) {
		int [][] matrizInicial = {{2,5,7},{1,6,6},{1,1,1},{6,8,5},{3,6,4},{1,8,5}};
		int [][] matrizFinal = new int [matrizInicial.length/2][matrizInicial[0].length];
		
		for (int i = 0; i < matrizFinal.length; i++) {
			
			for (int j = 0; j < matrizFinal[i].length; j++) {
				matrizFinal[i][j] = matrizInicial[i*2][j] + matrizInicial [(i*2)+1][j];
			}
		}
		
		System.out.println(Arrays.deepToString(matrizFinal));
	}

}

package repetidosMAtricesFunciones;

import java.util.Arrays;

public class MatrizParImpar {

	public static void main(String[] args) {
		int [][] matriz = new int [10][10];
		
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[i].length; j++) {
				if (i % 2 == 0) {
					matriz[i][j] = 1;
				}
				
				else {
					matriz [i][j] = 0;
				}
			}
		}
		
		System.out.println(Arrays.deepToString(matriz));
	}

}

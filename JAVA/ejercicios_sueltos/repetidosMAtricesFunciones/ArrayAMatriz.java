package repetidosMAtricesFunciones;

import java.util.Arrays;

public class ArrayAMatriz {

	public static void main(String[] args) {
		int [] array = {4,1,4,6,3,1,8,6,8,2,7,9,2,1,1,6,8,6,4,7,9,0,1,3};
		int filas = array.length/4;
		int [][] matriz = new int [filas][4];
		int contador = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = array [contador];
				contador++;
			}
			
		}
		
		System.out.println(Arrays.deepToString(matriz));
	}

}

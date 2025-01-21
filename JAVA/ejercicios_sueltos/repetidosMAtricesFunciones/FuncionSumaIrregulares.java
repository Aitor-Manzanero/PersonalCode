package repetidosMAtricesFunciones;

import java.util.Arrays;

public class FuncionSumaIrregulares {

	public static void main(String[] args) {
		int [][] matriz1 = {{9, 7, 3, 4}, {2, 5, 2, 1, 9, 7, 9, 11}, {1, 9, 8}};
		int [][] matriz2 = {{10, 9, 3, 4, 5}, {4, 10, 11, 2, 13, 7}, {3, 17, 13}, {4, 5}};
		
		int maxFilas, minFilas;
		
		if (matriz1.length > matriz2.length) {
			maxFilas = matriz1.length;
			minFilas = matriz2.length;
		}
		
		else {
			maxFilas = matriz2.length;
			minFilas = matriz1.length;
		}
		
		int [][] suma = new int [maxFilas][];
		
		for (int i = 0; i < minFilas; i++) {
			
			if (matriz1[i].length > matriz2[i].length ) {
				suma[i] = new int [matriz1[i].length];
			}
			
			else {
				suma[i] = new int [matriz2[i].length];
			}
		}
		
		for (int i = minFilas; i <maxFilas; i++) {
			if (maxFilas == matriz1.length) {
				suma[i] = new int [matriz1[i].length];
			}
			else {
				suma[i] = new int [matriz2[i].length];
			}
		}
		
		for (int i = 0; i <matriz1.length; i++) {
			for (int j = 0; j <matriz1[i].length; j++) {
				suma[i][j] = matriz1[i][j];
			}
		}
		
		for (int i = 0; i <matriz2.length; i++) {
			for (int j = 0; j <matriz2[i].length; j++) {
				suma[i][j] = suma[i][j] + matriz2[i][j];
			}
		}
		
		System.out.println(Arrays.deepToString(suma));
		
	}
}

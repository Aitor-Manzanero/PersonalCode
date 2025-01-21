package repetidosMAtricesFunciones;

import java.util.Scanner;

public class MatrizIrregular {

	public static void main(String[] args) {
		int [][] matrizIrregular = new int [5][];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0 ; i < matrizIrregular.length; i++) {
			matrizIrregular[i] = new int [i+1];
		}
		
		for (int i = 0; i < matrizIrregular.length; i++) {
			
			for (int j = 0; j < matrizIrregular[i].length; j++) {
				System.out.println("Introduce el valor para la fila " + i + " columna " + j);
				matrizIrregular[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < matrizIrregular.length; i++) {
			
			for (int j = 0; j < matrizIrregular[i].length; j++) {
				System.out.print(matrizIrregular[i][j] + "\t");
			}
			System.out.println();
		}
		
		
	}

}

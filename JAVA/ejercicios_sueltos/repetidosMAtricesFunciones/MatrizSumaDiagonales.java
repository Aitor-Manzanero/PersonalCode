package repetidosMAtricesFunciones;

public class MatrizSumaDiagonales {

	public static void main(String[] args) {
		int [][] matrizI = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19, 20},{21,22,23,24,25}};
		int sumaDiagonal = 0;
		
		for (int i = 0; i < matrizI.length; i++) {
			
			for (int j = 0; j < matrizI[0].length; j++) {
				
				if (i == j) {
					sumaDiagonal += matrizI[i][j];
				}
				if (i+j == matrizI.length-1) {
					sumaDiagonal += matrizI[i][j];
				}
				
			}

		}
		System.out.println(sumaDiagonal);
	}

}

package repetidosMAtricesFunciones;

public class MatrizMultiplicar {

	public static void main(String[] args) {
		int[][] tablaMultiplicar = new int [10][10];
		
		for (int i = 0; i < tablaMultiplicar.length; i++) {
			
			for (int j = 0; j < tablaMultiplicar.length; j++) {
				tablaMultiplicar[i][j] = (i+1)*(j+1);
				System.out.println(tablaMultiplicar[i][j]);
			}
		}
	}

}

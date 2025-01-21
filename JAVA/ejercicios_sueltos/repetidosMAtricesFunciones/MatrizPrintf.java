package repetidosMAtricesFunciones;

public class MatrizPrintf {

	public static void main(String[] args) {
		int [][] matriz = new int [3][6];
		matriz[0][0] = 0;
		matriz[0][1] = 30;
		matriz[0][2] = 2;
		matriz[0][5] = 5;
		matriz[1][0] = 75;
		matriz[1][4] = 4;
		matriz[2][2] = -2;
		matriz[2][3] = 9;
		matriz[2][5] = 11;
	
	System.out.printf("%6s", " "); //Dibuja los espacios de la esquina superior izquierda
	for (int i = 0; i < 6; i++) {	//Para dibujar en encabezado de columnas
		System.out.printf("%9s %d"," Columna ", i);
	}
	
	for (int i = 0; i < 3; i++) {
		System.out.printf("\nFila %d", i); //Para dibujar el encabezado de filas
		for (int j = 0; j < 6; j++) {
			System.out.printf("%11s", matriz[i][j]);
		}
	}
	
	}
}

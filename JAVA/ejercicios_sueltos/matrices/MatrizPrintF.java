/* Define un array de números enteros de 3 filas por 6 columnas con nombre num y asigna 
los valores según la siguiente tabla (ver tabla) y utiliza printf para mostrarla  */

package matrices;

public class MatrizPrintF {

	public static void main(String[] args) {
		int [][] num = new int [3][6];
		num[0][0] = 0;
		num[0][1] = 30;
		num[0][2] = 2;
		num[0][5] = 5;
		num[1][0] = 75;
		num[1][4] = 0;
		num[2][2] = -2;
		num[2][3] = 9;
		num[2][5] = 11;
		
		
		System.out.printf("%6s", " ");
		for (int columna = 0; columna < num[0].length; columna++)
		{
			System.out.printf("%10s", "Columna " + columna);
		}
		
		for (int fila = 0; fila < num.length; fila++)
		{
			System.out.printf("\nFila ", fila);
			for (int columna = 0; columna < num[fila].length; columna++)
			{
				System.out.printf("%10s", num[fila][columna]);
			}
		}
	}
}

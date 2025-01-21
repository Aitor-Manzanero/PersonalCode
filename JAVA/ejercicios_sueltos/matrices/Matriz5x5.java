/* Crea un programa que cree una matriz de tamaño 5x5 que almacene los números del 1 al 25
y luego muestre la matriz por pantalla. */

package matrices;

public class Matriz5x5 {

	public static void main(String[] args) {
		int [][] matriz= new int[5][5];
		int cont=1;
		
		for (int i=0; i<matriz.length; i++)
		{
			for (int j=0; j<matriz[0].length; j++)
			{
				matriz[i][j]=cont++;
				System.out.print(matriz[i][j] + " ");
			}
		System.out.println();
		}
	}

}

/* En una matriz de enteros obtener cual es el elemento  mayor.
Probarlo con: {{1,2,2,4,5},{6,7,7,9,10},{21,22,25,4,2},{1,2,3,4,3},{16,17,2,19,20}} */

package matrices;

public class ElementoMayor {

	public static void main(String[] args) {
		int [][] matriz = {{1,2,2,4,5},{6,7,7,9,10},{21,22,25,4,2},{1,2,3,4,3},{16,17,2,19,20}};
		int elementoMayor = 0;
		
		for (int i = 0; i < matriz.length; i++)
		{
			for (int j = 0; j < matriz[i].length;j++)
			{
				if (i == 0 & j == 0)
				{
					elementoMayor = matriz[i][j];
				}
				else if (matriz[i][j] > elementoMayor)
				{
					elementoMayor = matriz[i][j];
				}
			}
		}
		
		System.out.println(elementoMayor);
	}

}

/* Obtener y mostrar la longitud de la fila más larga de un array  bidimensional. 
Probarlo con el siguiente array: {{43,1},{67,3,1,8,6,8},{2,7,9,2,1},{1,6,8},{4,7}} */

package matrices;

public class LongitudMayor {

	public static void main(String[] args) {
		int [][] matriz = {{43,1},{67,3,1,8,6,8},{2,7,9,2,1},{1,6,8},{4,7}};
		int longitud = 0;
		
		for (int i = 0; i < matriz.length; i++)
		{
			for (int j = 0; j < matriz[i].length; j++)
			{
				if (j > longitud)
				{
					longitud = j+1;
				}
			}
		}
		
		System.out.println(longitud);
	}

}

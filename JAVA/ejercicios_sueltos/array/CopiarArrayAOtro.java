/* Crea un programa que cree dos arrays de enteros de tamaño 100. Luego introducirá en el
primer array todos los valores del 1 al 100. Por último, deberá copiar todos los valores del
primer array al segundo array en orden inverso, y mostrar ambos por pantalla.*/

package array;

public class CopiarArrayAOtro {

	public static void main(String[] args) {
		int [] array1=new int[100];
		int [] array2=new int[100];
		
		for (int i=0; i<array1.length;i++)
		{
			array1[i]=i+1;
		}
		
		int cont=100;
		
		for (int i=0; i<array1.length;i++)
		{
			cont--;
			array2[i]=array1[cont];	
		}
		
		for (int i=0; i<array1.length; i++)
		{
			System.out.print(array1[i] + " ");
		}
		
		System.out.println();
		
		for (int i=0; i<array1.length; i++)
		{
			System.out.print(array2[i] + " ");
		}
				
 	}

}

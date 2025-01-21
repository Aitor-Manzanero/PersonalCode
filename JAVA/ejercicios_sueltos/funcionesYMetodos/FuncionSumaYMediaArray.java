/* Escribe un programa que cree un array de tamaño 100 con los primeros 100 números naturales. Luego muestra la 
suma total y la media. Implementa una función que calcule la suma de un array y otra que calcule la media de un array. */

package funcionesYMetodos;

public class FuncionSumaYMediaArray {

	public static int sumaArray (int [] numeros)
	{
		int suma = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			suma += numeros[i];
		}
		
		return suma;
	}
	
	public static double mediaArray (int [] numeros)
	{
		double media = 0;
		
		for (int i = 0; i < numeros.length; i++) {		//Creo que podría recoger ya la suma  de sumaArray, y simplificarse
			media += numeros[i];
			
			if (i+1 == numeros.length)
			{
				media = media / (i+1); // También valdría numeros.length
			}
		}
		
		return media;
	}
	
	public static void main(String[] args) {
		int [] numNaturales = new int [100];
		
		for (int i = 0; i < numNaturales.length; i++) {
			numNaturales[i]=i+1;
		}
		
		int suma = sumaArray (numNaturales);
		double media = mediaArray (numNaturales);
		System.out.println(suma);
		System.out.println(media);
	}

}

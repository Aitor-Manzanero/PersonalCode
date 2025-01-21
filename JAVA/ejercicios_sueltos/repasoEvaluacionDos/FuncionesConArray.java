/* Hacer un programa con las funciones:

generarArray(): genera un array unidimensional de un tamaño aleatorio entre 5 y 10 (incluidos) y lo devuelve.
rellenaArray(): rellena un array pasado como parámetro de números aleatorios enteros entre 10 y 200 (incluidos)
mostrarArray():ordena un array de mayor a menor y lo muestra por consola.
El programa ejecutará estas 3 funciones en orden, de manera que el resultado final sea mostrar el array.

Ejemplo de ejecución:

 [200, 198, 181, 134, 133, 47] */

package repasoEvaluacionDos;

import java.util.Arrays;

public class FuncionesConArray {

	public static void main(String[] args) {
		int [] Array =	generaArray();
		rellenaArray(Array);
		mostrarArray(Array);
	}
	
	public static int [] generaArray () {
		int [] Array = new int [(int) (Math.random()*10-5+1)+5];
		return Array;
	}
	
	public static int [] rellenaArray (int [] Array) {		//Podría usarse un void pues al ser paso como parámetro ya lo está modificando, sin necesidad de retorno
		
		for (int i = 0; i < Array.length; i++) {
			
			Array[i] =(int) ((Math.random()*100-10+1)+10);
		}
		return Array;
	}
	
	public static void mostrarArray (int [] Array) {
		
		Arrays.sort(Array);
		int[] arrayRelleno = new int [Array.length];	//Variable para almacenar los valores al revés y mostrarse
		
		for (int i = 0; i < Array.length; i++) {
			arrayRelleno[i] = Array [Array.length -(i+1)];
		}
		
		System.out.println(Arrays.toString(arrayRelleno));
	}

}

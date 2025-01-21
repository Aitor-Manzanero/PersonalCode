package repetidosMAtricesFunciones;

import java.util.Arrays;

public class FuncionesArrays {

	public static void main(String[] args) {
		int [] array = generaArray();
		rellenaArray(array);
		int [] arrayFinal = mostrarArray(array);
		System.out.println(Arrays.toString(arrayFinal));
	}
	
	public static int [] generaArray() {
		int [] array = new int[(int) (Math.random()*(10-5)+6)];
		return array;
	}	
	
	public static int [] rellenaArray(int [] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random()*(200-10)+11);
		}
		return array;
	}
	
	public static int [] mostrarArray(int[] array) {
		Arrays.sort(array);
		int [] arrayFinal = new int [array.length];
		
		for (int i = 0; i < arrayFinal.length; i++) {
			arrayFinal[i] = array[array.length - (i+1)];
		}
		
		return arrayFinal;
	}
}

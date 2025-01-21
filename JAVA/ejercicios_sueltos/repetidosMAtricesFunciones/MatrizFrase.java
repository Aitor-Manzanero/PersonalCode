package repetidosMAtricesFunciones;

import java.util.Arrays;

public class MatrizFrase {

	public static void main(String[] args) {
		String frase = "Hola me llamo lola";
		String [] arrayFrase = frase.split(" ");
		char [][] matrizCaracteres = new char [arrayFrase.length][];
		
		for (int i = 0; i <matrizCaracteres.length; i++) {
			matrizCaracteres[i] = new char [arrayFrase[i].length()];
			
			for (int j = 0; j <matrizCaracteres[i].length; j++) {
				matrizCaracteres[i][j] = arrayFrase[i].charAt(j);
			}
		}
		
		System.out.println(Arrays.deepToString(matrizCaracteres));
	}

}

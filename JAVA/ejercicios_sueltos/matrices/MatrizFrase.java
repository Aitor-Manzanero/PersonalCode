/* Solicita al usuario una frase, después crea un array bidimensional en el que cada fila sea una 
palabra de la frase y las columnas serán las letras que forman esas palabras. */

package matrices;

import java.util.Scanner;
import java.util.Arrays;

public class MatrizFrase {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce una frase.");
		String frase = sc.nextLine();
		
		String [] palabras = frase.split(" ");
		char [][] letras = new char [palabras.length][]; 
		
		for (int i = 0; i <palabras.length; i++) {
			letras[i] = new char [palabras[i].length()];
			for (int j = 0; j <palabras[i].length(); j++) {
				letras[i][j] = palabras[i].charAt(j);
			}
		}
		
		System.out.println(Arrays.deepToString(letras));
	}

}

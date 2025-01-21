/*Obtener la suma de estas tres palabras:
“coche” “locomotora” “camión”. */
//Ese es el enunciado original, que es ambiguo. Realmente quiere sumar longitudes.
package metodosString;

public class SumaPalabras {

	public static void main(String[] args) {
		String palabra1="coche";
		String palabra2="locomotora";
		String palabra3="camión";
		int longitudTotal= palabra1.length() + palabra2.length() + palabra3.length();
		System.out.println("La suma de la longitud de las palabras es: " + longitudTotal);
	}

}

/*. Realiza un programa que lea una frase por teclado e indique si la frase es un palíndromo o no
(ignorando espacios y sin diferenciar entre mayúsculas y minúsculas). Supondremos que el
usuario solo introducirá letras y espacios (ni comas, ni puntos, ni acentos, etc.). Un palíndromo
es un texto que se lee igual de izquierda a derecha que de derecha a izquierda. Por ejemplo:
Amigo no gima
Dabale arroz a la zorra el abad Amo
la pacífica paloma */

package metodosString;
import java.util.Scanner;
public class Palindromo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce una frase para saber si es un palíndromo");
		String frase=sc.nextLine();
		String fraseFinal=frase.replace(" ", "").toLowerCase();
		boolean palindromo=true;
		
		for (int i=0; i<fraseFinal.length(); i++)	//Esto podría hacerse con /2 aunque así está bien.
		{
			if (fraseFinal.charAt(i)!=fraseFinal.charAt(fraseFinal.length()-1-i))	//El -1 es porque charAt empieza en 0, pero length en 1, y se sale de rango.
			{
				palindromo=false;
				break;
			}
		}
		
		if (palindromo)
		{
			System.out.println("Es palíndromo");
		}
		else
		{
			System.out.println("No es palíndromo");
		}
	}

}

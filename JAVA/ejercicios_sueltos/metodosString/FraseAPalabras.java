/*Crea un programa que pida una cadena de texto por teclado y luego muestre cada palabra de
la cadena en una línea distinta. */

package metodosString;
import java.util.Scanner;
public class FraseAPalabras {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce una frase");
		String frase=sc.nextLine();
		for(int i=0; i<frase.length();i++)
		{
			int espacio=frase.indexOf(' ');
			
		}
	}

}

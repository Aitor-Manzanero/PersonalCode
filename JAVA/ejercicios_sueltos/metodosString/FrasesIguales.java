/*Crea un programa que pida dos cadenas de texto por teclado y luego indique si son iguales,
además de si son iguales sin diferenciar entre mayúsculas y minúsculas. */

package metodosString;
import java.util.Scanner;
public class FrasesIguales {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Introduce la primera frase");
		String frase1=sc.nextLine();
		System.out.println("Introduce la segunda frase");
		String frase2=sc.nextLine();
		boolean iguales=frase1.equals(frase2);
		boolean igualesMayus=frase1.equalsIgnoreCase(frase2);
		if ( iguales)
		{
			System.out.println("Las frases son idénticas");
		}
		
		else if (igualesMayus)
		{
			System.out.println("Las frase son idénticas, salvo por las mayúsculas y minúsculas");
		}
		else
		{
			System.out.println("Las frases son distintas");
		}
	}

}

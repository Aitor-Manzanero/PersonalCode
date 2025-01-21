/*Crea un programa que muestre por pantalla cuantas vocales de cada tipo hay (cuantas ‘a’,
cuantas ‘e’, etc.) en una frase introducida por teclado. No se debe diferenciar entre mayúsculas
y minúsculas. Por ejemplo dada la frase “Mi mama me mima” dirá que hay: 
Nº de A's: 3 
Nº de E's: 1
Nº de I's: 2
Nº de O's: 0
Nº de U's: 0  */

package metodosString;
import java.util.Scanner;
public class CuantasVocales {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=0;
		int e=0;
		int i=0;
		int o=0;
		int u=0;
		System.out.println("Introduce una frase");
		String frase=sc.nextLine();
		
		for (int j=0; j<frase.length(); j++)	//Aquí hubiera sido mejor usar un switch
		{
			char buscado=frase.charAt(j);
			if (buscado=='a')
			{
				a++;
			}
			else if (buscado=='e')
			{
				e++;
			}
			else if (buscado=='i')
			{
				i++;
			}
			else if (buscado=='o')
			{
				o++;
			}
			else if (buscado=='u')
			{
				u++;
			}
		}
		System.out.println("Cantidad total de aes: " + a);
		System.out.println("Cantidad total de es: " + e);
		System.out.println("Cantidad total de ies: " + i);
		System.out.println("Cantidad total de oes: " + o);
		System.out.println("Cantidad total de ues: " + u);
	}
}

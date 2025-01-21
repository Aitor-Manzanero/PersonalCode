/* En cualquier frase cambiar la primera y la última palabra a mayúsculas. Probarlo con la frase
“Esta es la frase donde vamos a hacer los cambios” */

package metodosString;
import java.util.Scanner;
public class PrimeraYUltimaMayusculas {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce una frase");
		String frase=sc.nextLine();
		String primeraMayus=frase.substring(0,1);
		primeraMayus=primeraMayus.toUpperCase();
		String ultimaMayus=frase.substring(frase.length()-1);
		ultimaMayus=ultimaMayus.toUpperCase();
		String fraseRestante=frase.substring(1,frase.length()-1);
		System.out.println(primeraMayus + fraseRestante + ultimaMayus);
	}

}

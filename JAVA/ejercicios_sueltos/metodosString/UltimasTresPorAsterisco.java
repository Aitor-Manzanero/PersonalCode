/* En cualquier frase sustituir las últimas tres letras ‘a’ por tres asteriscos. Probarlo con la frase
“Esta es la frase en la que vamos a probar”. */

package metodosString;

public class UltimasTresPorAsterisco {
	
	public static void main(String[] args) {
		String frase="Esta es la frase en la que vamos a probar";
		frase=frase.substring(0,frase.length()-3);
		System.out.println(frase+"***");
		
	}
}

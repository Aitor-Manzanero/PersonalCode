/* En cualquier frase sustituir las primeras tres letras ‘a’ por tres asteriscos. Probarlo con la frase
“Esta es la frase en la que vamos a probar” */

package metodosString;

public class APorAsterisco {

	public static void main(String[] args) {
		String frase = "Esta es la frase en la que vamos a probar";
		String fraseFinal= "";
		int cont=0;
		for ( int i=0 ; i<frase.length() ; i++)
		{
			if ((frase.charAt(i)=='a' | frase.charAt(i)=='A' | frase.charAt(i)=='á' | frase.charAt(i)=='Á') & cont<3)
			{
				fraseFinal=fraseFinal + '*';
				cont++;
			}
			else
			{
				fraseFinal=fraseFinal+frase.charAt(i);
			}
		}
		System.out.println(fraseFinal);
	}

}

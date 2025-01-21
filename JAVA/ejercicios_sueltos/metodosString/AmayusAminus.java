/* En un String con cualquier número de letras ‘a’ convertir una en mayúsculas y la siguiente
dejarla como está, la siguiente en mayúsculas y la siguiente dejarla… etc… Probarlo con “Esta
es una frase con algunas letras a”. */

package metodosString;

public class AmayusAminus {

	public static void main(String[] args) {
		String frase = "Esta es una frase con algunas letras a";
		String fraseFinal="";
		int cont=0;
		
		for (int i=0 ; i<frase.length() ; i++)
		{
			if (frase.charAt(i)=='a' | frase.charAt(i)=='A' | frase.charAt(i)=='á' | frase.charAt(i)=='Á')
			{
				cont++;
				if (cont%2!=0)
				{
					
				}
			}
		}
	}

}

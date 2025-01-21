/* Obtener el número de palabras que hay en cualquier frase. Probarlo con “A ver cuántas
palabras hay aquí.”*/

package metodosString;

public class ContarPalabras {

	public static void main(String[] args) {
		String frase = "A ver cuántas palabras hay aquí.";
		frase=frase.trim();
		int cont=1;
		
		for (int i=0 ; i<frase.length() ; i++)
		{
			if(frase.charAt(i)==' ')
			{
				cont++;
			}
		}
		
		System.out.println(cont);
		
	}

}

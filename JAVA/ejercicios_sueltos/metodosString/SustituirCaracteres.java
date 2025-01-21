/*En cualquier frase sustituir todas las posiciones múltiplos de 3 por ‘#’. Probarlo con “Esta es la
frase donde vamos a poner almohadillas” */

package metodosString;

public class SustituirCaracteres {

	public static void main(String[] args) {
		String frase="Esta es la frase donde vamos a poner almohadillas";
		String fraseFinal="";
		for (int i=0; i<frase.length()-1; i++)
		{
			if(i%3==0)
			{
				fraseFinal+="#";
			}
			else
			{
				fraseFinal=fraseFinal+frase.charAt(i);
			}
		}
		System.out.println(fraseFinal);
	}

}

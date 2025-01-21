/*Obtener en qué posición está la cuarta ‘a’ en una frase. Si la frase tiene menos de 4 aes tiene
que indicarlo. “Probarlo con “Esta es una frase con unas cuantas aes” */

package metodosString;

public class PosicionCuartaA {

	public static void main(String[] args) {
		String frase = "Esta es una frase con unas cuantas aes";
		String fraseMinus = frase.toLowerCase();
		int cont=0;		
		
		for (int i=0; i<fraseMinus.length(); i++)
		{
			if (fraseMinus.charAt(i)=='a')
			{
				cont++;
			}
			if(cont==4)
			{
				System.out.println("La cuarta a está en la posición " + i);
				break;
			}
		}
		if (cont<4)
		{
			System.out.println("Solo tiene " + cont + " aes");
		}
		
	}

}

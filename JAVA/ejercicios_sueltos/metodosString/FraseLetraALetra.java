/* Crea un programa que muestre cada una de las letras de una frase en una línea,
exceptuando los espacios. Probar con "Esta es la frase del Ejercicio 8".*/
package metodosString;

public class FraseLetraALetra {

	public static void main(String[] args) {
		String frase= "Esta es la frase del Ejercicio 8";
		frase= frase.replace(" ", "");
		
		for (int i=0; i<frase.length(); i++)
		{
			System.out.println(frase.substring(i,i+1)); //Podría haberse usado charAt(i)
		}
	}

}

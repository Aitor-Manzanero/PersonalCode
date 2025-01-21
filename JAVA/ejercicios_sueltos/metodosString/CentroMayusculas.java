/* Convertir cualquier palabra con un número impar de caracteres y de más de dos caracteres en
minúsculas excepto el carácter justo del medio que será con mayúsculas. Probarlo con
“TERREMOTO”: "terrEmoto" */

package metodosString;

public class CentroMayusculas {

	public static void main(String[] args) {
		String fraseInicial= "TERREMOTO";
		
		if (fraseInicial.length()%2!=0 & fraseInicial.length()>2)
		{
			fraseInicial=fraseInicial.toLowerCase();
			String frasePrimera=fraseInicial.substring(0, fraseInicial.length()/2);
			String fraseCentro=fraseInicial.substring(fraseInicial.length()/2,(fraseInicial.length()/2)+1);
			fraseCentro=fraseCentro.toUpperCase();
			String fraseUltima=fraseInicial.substring(fraseInicial.length()/2+1);
			System.out.println(frasePrimera + fraseCentro + fraseUltima);
		}
		
		else
		{
			System.out.println("La frase no tiene un número impar de caracteres o no tiene más de dos caracteres");
		}
		
	}

}

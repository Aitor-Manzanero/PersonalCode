/* Partir una frase en dos. A continuación partir cada una de las dos mitades en otras dos.
Mostrar las cuatro partes. (Si en cualquier división el número es impar la segunda
mitad tendrá un carácter más). Probarlo con “Esta es la frase que vamos a partir en cuatro”
 */
package metodosString;

public class FrasePartida {

	public static void main(String[] args) {
		String frase = "Esta es la frase que vamos a partir en cuatro";
		String mitadUno=frase.substring(0,frase.length()/2);
		String mitadDos=frase.substring(frase.length()/2, frase.length());
		String cuartoUno=mitadUno.substring(0, mitadUno.length()/2);
		String cuartoDos=mitadUno.substring(mitadUno.length()/2, mitadUno.length());
		String cuartoTres=mitadDos.substring(0, mitadDos.length()/2);
		String cuartoCuatro=mitadDos.substring(mitadDos.length()/2, mitadDos.length());
		System.out.println(cuartoUno);
		System.out.println(cuartoDos);
		System.out.println(cuartoTres);
		System.out.println(cuartoCuatro);
	}

}

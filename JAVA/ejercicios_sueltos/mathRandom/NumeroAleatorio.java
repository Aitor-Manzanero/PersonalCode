/* Realiza un programa en Java que reciba por teclado un número entero mayor que 1 y devuelva un número aleatorio 
entero entre 1 y el número recibido (ambos incluidos). Deberás usar el método ramdom de la clase Math que devuelve 
un número aleatorio de tipo double entre 0 y 1 */

package mathRandom;

import java.util.Scanner;

public class NumeroAleatorio {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Introduce un número entero positivo");
		int num=sc.nextInt();
		int aleatorio=(int) (Math.random()*num)+1;
		System.out.println(aleatorio);
	}

}

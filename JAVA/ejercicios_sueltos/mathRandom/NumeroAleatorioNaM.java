/* Realiza un programa en Java que reciba por teclado dos números y devuelva un número aleatorio 
entero entre el primero y el segundo (ambos incluidos). Se asume que el primer número nunca será mayor que el segundo.
Deberás usar el método ramdom de la clase Math que devuelve un número aleatorio de tipo double entre 0 y 1 */

package mathRandom;

import java.util.Scanner;

public class NumeroAleatorioNaM {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce el primer número entero positivo");
		int num1=sc.nextInt();
		System.out.println("Introduce el segundo número entero positivo. Deberá ser mayor que el primero");
		int num2=sc.nextInt();
		int aleatorio=(int) (Math.random()*(num2-num1+1)+num1);
		System.out.println(aleatorio);
	}

}

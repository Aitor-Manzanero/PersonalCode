/* Realiza un programa en Java que reciba por teclado dos números y devuelva un número aleatorio 
entero entre el primero y el segundo (ambos incluidos). 
No sabemos cuál de los dos números es mayor ya que el usuario puede escribirlos en cualquier orden.
Deberás usar el método ramdom de la clase Math que devuelve un número aleatorio de tipo double entre 0 y 1 */

package mathRandom;

import java.util.Scanner;

public class NumeroAleatorioNaM2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce el primer número entero positivo");
		int num1=sc.nextInt();
		System.out.println("Introduce el segundo número entero positivo");
		int num2=sc.nextInt();
		
		if(num2>num1)
		{
			int aleatorio=(int) (Math.random()*(num2-num1+1)+num1);
			System.out.println(aleatorio);
		}
		
		else if (num1>num2)
		{
			int aleatorio=(int) (Math.random()*(num1-num2+1)+num2);
			System.out.println(aleatorio);
		}
		
		else
		{
			System.out.println(num1);
		}
	}

}

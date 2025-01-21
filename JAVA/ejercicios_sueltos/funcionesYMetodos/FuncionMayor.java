/* Realiza un programa que pida introducir tres valores enteros y nos diga cuál de ellos es el más
elevado. Impleméntalo creando únicamente una función a la que le pasemos dos valores (no tres)
y nos devuelva el máximo de los dos valores.  */

package funcionesYMetodos;

import java.util.Scanner;

public class FuncionMayor {
	
	public static int mayor (int a, int b)
	{
		if (a>b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer valor: ");
		int a = sc.nextInt();
		System.out.println("Introduce el segundo valor: ");
		int b = sc.nextInt();
		System.out.println("Introduce el tercer valor: ");
		int c = sc.nextInt();
		
		/* Esta parte fue mi idea, pero la solución podría ser sin usar if y else:
		if (mayor(a,b)>c)
		{
			System.out.println(mayor(a,b));
		}
		else
		{
			System.out.println(c);
		}
		*/
		
		int masAlto = mayor (a, b);
		masAlto = mayor (masAlto, c);
		System.out.println(masAlto);
		
	}

}

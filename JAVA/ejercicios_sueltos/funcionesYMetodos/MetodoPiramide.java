/* Escribe una función que muestre por pantalla un triángulo como el del ejemplo. Deberá recibir
dos parámetros: el carácter que se desea imprimir y el número de líneas del triángulo.  */

package funcionesYMetodos;

import java.util.Scanner;

public class MetodoPiramide {

	public static void triangulo (String caracter, int lineas)
	{
		for (int i = 1; i <= lineas; i++)
		{
			System.out.println();
			
			for (int j = i -1; j <= lineas; j++)
			{
				 System.out.print(" ");
			}
			
			for (int j = 0; j < (i*2)-1; j++)
			{
				System.out.print(caracter);
			}
			
			 System.out.print(" ");
		}

	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el caracter que quieres imprimir");
		String caracter = sc.nextLine();
		System.out.println("Introduce la cantidad de líneas del triángulo");
		int lineas = sc.nextInt();
		
		triangulo (caracter, lineas);
		System.out.println();
	}

}

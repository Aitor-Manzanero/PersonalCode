/* Escribe un programa que pida la edad por teclado y muestre por pantalla si eres mayor de edad o
no. Implementa y utiliza la función:
boolean esMayorEdad(int a) // Devuelve verdadero si a>=18, falso en caso contrario */

package funcionesYMetodos;

import java.util.Scanner;

public class FuncionEdad {

	public static boolean esMayorEdad(int a)
	{
		if (a>=18)
		{
		return true;
		}
		else
		{
		return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce la edad");
		int edad = sc.nextInt();
		// boolean mayorEdad = esMayorEdad(edad);   No es una linea necesaria
		if (esMayorEdad(edad))
		{
			System.out.println("Es mayor de edad.");
		}
		else
		{
			System.out.println("No es mayor de edad");
		}
		
	}

}

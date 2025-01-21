/* Crea un programa que cree un array de 10 enteros y luego muestre el siguiente menú con
distintas opciones:
a. Mostrar valores.
b. Introducir valor.
c. Salir.
La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá un valor V y una
posición P, luego escribirá V en la posición P del array. El menú se repetirá indefinidamente
hasta que el usuario elija la opción ‘c’ que terminará el programa. */


package array;

import java.util.Scanner;

public class ArrayConMenu {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int [] array =new int[10];
		String opcion;
		int V;
		int P;
		
		do
		{
			System.out.println("Introduce a para mostrar valores");
			System.out.println("Introduce b para introducir valores");
			System.out.println("Introduce c para salir");
			opcion=sc.nextLine();
			switch (opcion) {
			case "a": 
				for (int i=0; i<array.length; i++)
				{
					System.out.print(array[i] + " ");
				}
				System.out.println();
				break;
			case "b":
				System.out.println("Introduce el valor que quieres añadir");
				V= sc.nextInt();
				System.out.println("Introduce la posición en la que quieres que se añada, teniendo en cuenta que la primera posición es igual a 0");
				P=sc.nextInt();
				sc.nextLine();
				array[P]=V;
				break;
			case "c":
				System.out.println("Hasta otra");
				break;
			default:
				System.out.println("Valor no valido.");
			}
		}
		while (!opcion.equals("c"));
	}

}

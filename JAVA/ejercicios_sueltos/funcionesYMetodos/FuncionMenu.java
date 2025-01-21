/* Escribe un programa que muestre un menú con 2 opciones: “1.Circunferencia” y “2.Área”.
En ambas se le pedirá al usuario que introduzca un radio y luego se le mostrará el cálculo oportuno.
Implementa las funciones:
int menu() // Muestra el menú y devuelve el número elegido
double pideRadio() // Pide que se introduzca el radio y lo devuelve
double circunferencia(double r) // Calcula la circunferencia devuelve
double area(double r) // Calcula el área y la devuelve

Modifica el programa añadiendo otra opción llamada “Volumen”, permitiendo que el usuario también
pueda solicitar el cálculo del volumen. Añade la función: double volumen(double r) // Calcula el
volumen y lo devuelve

Modifica el programa añadiendo otra opción llamada “Todas” en la que se pida el radio una sola vez
y se muestren los tres cálculos posibles (circunferencia, área y volumen).

Modifica el programa anterior de modo que el proceso se repita una y otra vez (mostrar menú ->
realizar el cálculo -> volver a mostrar menú). Añade una opción más llamada “Salir” que terminará
el programa si es elegida.  */

package funcionesYMetodos;

import java.util.Arrays;
import java.util.Scanner;

//Esta es mi solución, pero no es muy correcta. Ver FuncionesMinimoBien para ver la correción.

public class FuncionMenu {

	static double [] resultadosTotales;	// Esto es necesario para poder almacenar el array.
	
	public static int menu()
	{
		Scanner sc = new Scanner(System.in);
			System.out.println("Selecciona qué quieres hacer: ");
			System.out.println("Escribe 1 para calcular la circunferencia. ");
			System.out.println("Escribe 2 para calcular el área. ");
			System.out.println("Escribe 3 para calcular el volumen. ");
			System.out.println("Escribe 4 para calcular todos a la vez. ");
			System.out.println("Escribe 5 para salir. ");
			int opcion = sc.nextInt();
			double radio = 0;
			
				switch (opcion)
				{
				case 1:
					radio = pideRadio();
					double circunferencia = circunferencia(radio);
					return (int) circunferencia;
				case 2: 
					radio = pideRadio();
					double area = area(radio);
					return (int) area;
				case 3:
					radio = pideRadio();
					double volumen = volumen(radio);
					return (int) volumen;
				case 4:	
					radio = pideRadio();
					resultadosTotales = todas(radio);
					return -2;
				case 5:
					return -3;
				default: 
					return -1;
				}
	}
	
	public static double pideRadio()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el valor del radio");
		double radio = sc.nextDouble();
		return radio;
	}
	
	public static double circunferencia (double r)
	{
		final double pi = 3.14;
		return 2*pi*r;
	}
	
	public static double area (double r)
	{
		final double pi = 3.14;
		return pi*r*r;
	}
	
	public static double volumen (double r)
	{
		final double pi = 3.14;
		return (4.0/3.0) * pi * r * r * r;	//IMPORTANTE: se añaden los decimales para que java lo considere como double.
	}
	
	public static double [] todas (double r)
	{
		double [] resultados = new double[3];
			resultados[0] = circunferencia(r);
			resultados[1] = area(r);
			resultados[2] = volumen(r);
		return resultados;
	}
	
	public static void main(String[] args) {
		int resultado = menu();
		
		do {
			if (resultado == -1)
			{
				System.out.println("Numero introducido no válido");
			}
			else if (resultado == -2)
			{
				 System.out.println("Circunferencia: " + resultadosTotales[0]);
		            System.out.println("Área: " + resultadosTotales[1]);
		            System.out.println("Volumen: " + resultadosTotales[2]);
			}
			else if (resultado == -3)
			{
				System.out.println("Hasta otra!.");
				break;
			}
			else
			{
				System.out.println(resultado);
			}
			resultado =menu();
			
		} while (resultado != -3);	
	}
	
}

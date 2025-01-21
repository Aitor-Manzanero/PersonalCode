/* Escribe un programa que pida cinco precios y muestre por pantalla el precio de venta de cada uno tras 
aplicarle un 21% de IVA. Implementa y utiliza la función:
double precioConIVA(double precio) // Devuelve el precio tras sumarle un 21% de IVA */

package funcionesYMetodos;

import java.util.Scanner;

public class FuncionIVA {

	public static double precioConIVA (double precio)
	{
		final double iva = 1.21;
		return precio*iva;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double producto;
		
		for (int i = 1; i < 5; i++)
		{
			System.out.println("Escribe el precio del producto nº: " + i);
			producto = sc.nextDouble();
			System.out.println(precioConIVA(producto));
		}
	}

}

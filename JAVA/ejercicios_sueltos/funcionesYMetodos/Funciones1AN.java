/* Escribe un programa que pida un valor N entero y luego muestre: el sumatorio des 1 a N, el
productorio de 1 a N y el valor intermedio entre 1 y N. Implementa y utiliza las funciones:
int suma1aN(int n) // Devuelve la suma de enteros de 1 a n
int producto1aN(int n) // Devuelve el producto de enteros de 1 a n
double intermedio1aN(int n) // Devuelve el valor intermedio entre 1 y n  */

package funcionesYMetodos;

import java.util.Scanner;	

public class Funciones1AN {

	public static int suma1aN (int n)
	{
		int suma = 0;
		
		for (int i = 1; i <= n; i++)
		{
			suma += i;
		}
		
		return suma;
	}
	
	public static int producto1aN (int n)
	{
		int producto = 1;
		
		for (int i = 1; i <=n; i++)
		{
			producto*=i;
		}
		
		return producto;
	}
	
	public static double intermedio1aN (int n)
	{
		double m=n;
		return ((1+m)/2);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número entero: ");
		int N = sc.nextInt();
		
		System.out.println(suma1aN (N));
		System.out.println(producto1aN (N));
		System.out.println(intermedio1aN (N));
	}

}

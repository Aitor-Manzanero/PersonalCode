/* . Escribe un programa que pida el ancho y alto de un rectángulo y muestre por pantalla su área y
su perímetro. Implementa y utiliza las funciones:
double perimetroRectangulo(double ancho, double alto) // Devuelve el perímetro
double areaRectangulo(double ancho, double alto) // Devuelve el área */

package funcionesYMetodos;

import java.util.Scanner;

public class FuncionRectangulo {

	public static double areaRectangulo(double ancho, double alto)
	{
		return ancho*alto;
	}
	
	public static double perimetroRectangulo(double ancho, double alto)
	{
		return (ancho*2)+(alto*2);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el ancho del rectángulo: ");
		double ancho = sc.nextDouble();
		System.out.println("Introduce el alto del rectángulo: ");
		double alto = sc.nextDouble();
		System.out.println(areaRectangulo(ancho, alto) + " " + perimetroRectangulo (ancho, alto));
	}

}

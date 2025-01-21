package repetidosMAtricesFunciones;

import java.util.Scanner;

public class FuncionRectangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el ancho: ");
		double ancho = sc.nextDouble();
		System.out.println("Introduce el alto: ");
		double alto = sc.nextDouble();
		
		System.out.println(perimetroRectangulo(ancho, alto) + " es el perímetro");
		System.out.println(areaRectangulo(ancho, alto) + " es el área");
	}
	
	public static double perimetroRectangulo(double ancho, double alto) {
		return (alto*2) + (ancho*2);
	}
	
	public static double areaRectangulo (double ancho, double alto) {
		return alto * ancho;
	}

}

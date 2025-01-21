package repetidosMAtricesFunciones;

import java.util.Scanner;

public class FuncionCalculoCirculo {

	static Scanner sc = new Scanner(System.in);
	static final double pi = 3.1416;
	
	public static void main(String[] args) {
		int opcion; 
		do {
			opcion = menu();
			switch (opcion) {
	            case 1:
	            	double rad = pideRadio();
	            	System.out.println("la circunferencia es de " + circunferencia(rad));
	                break;
	            case 2:
	            	rad = pideRadio();
	            	System.out.println("el área es de " + area(rad));
	            	break;
	            case 3:
	            	rad = pideRadio();
	            	System.out.println("el volumen es de " + volumen(rad));
	            	break;
	            case 4:
	            	rad = pideRadio();
	            	System.out.println("la circunferencia es de " + circunferencia(rad));
	            	System.out.println("el área es de " + area(rad));
	            	System.out.println("el volumen es de " + volumen(rad));
	            	break;	
	            case 5:
	            	System.out.println("Hasta otra!");
	            	break;
	            default : 
	            	System.out.println("Opción no reconocida");
			}    	
		} while (opcion !=5);
	}
	
	public static int menu() {
		System.out.println("1.Circunferencia");
		System.out.println("2.Área");
		System.out.println("3.Volumen");
		System.out.println("4.Todas");
		System.out.println("5.Salir");
		return sc.nextInt();
	}
	
	public static double pideRadio() {
		System.out.println("Introduce el radio del círculo");
		double radio = sc.nextDouble();
		return radio;
	}
	
	
	public static double circunferencia (double r) {
		return 2 * pi * r;
	}
	
	public static double area (double r) {
		return pi * r * r;
	}
	
	public static double volumen (double r) {
		return (((double) 4/3) * pi * Math.pow(r, 3));
	}
}

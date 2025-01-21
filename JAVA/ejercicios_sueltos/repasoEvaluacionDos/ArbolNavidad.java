package repasoEvaluacionDos;

import java.util.Scanner;

public class ArbolNavidad {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qué tamaño de árbol quieres?");
		int tamanio = sc.nextInt();
		arbolNavidad(tamanio);
	}
	
	public static void arbolNavidad (int tamanio) {
		
		for (int i = 1; i <= tamanio; i++) {
			
			for (int j = 1; j <= tamanio-i; j++ ) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= (2*i)-1; j++ ) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for (int i = 1; i < tamanio; i++) {
			
			for (int j = 1; j < tamanio; j++ ) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= 1; j++) {
				System.out.println("+");
			}
		}

	}

}

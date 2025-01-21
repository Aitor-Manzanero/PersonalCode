package repetidosMAtricesFunciones;

import java.util.Scanner;

public class FuncionPiramide {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el caracter que quieres imprimir.");
		char caracter = sc.nextLine().charAt(0);
		System.out.println("Introduce el número de filas de la pirámide.");
		int filasPiramide = sc.nextInt();
		
		dibujaPiramide (caracter, filasPiramide);
	}
	
	public static void dibujaPiramide (char caracter, int filasPiramide) {
		
		for (int i = 1; i <= filasPiramide; i++) {
			for (int j = 1; j <= filasPiramide-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2*i)-1; j++) {
				System.out.print(caracter);
			}
		System.out.println();	
		}
	}

}

package repasoEvaluacionDos;

import java.util.Scanner;

public class PiramideLetras {

		public static void dibujinchis (char letra) {
		
			int distancia = letra - 'A';
			int vecesletra = 1;
			
			for (char inicial = 'A'; inicial <= letra; inicial++) {
				
				
				for (int i = 1; i <= distancia; i++) { //Guiones ---
					System.out.print("-");
				}
				
				for (int i = 1; i <=vecesletra; i++) {
					System.out.print(inicial);
				}
				
				for (int i = 1; i <= distancia; i++) {
					System.out.print("-");
				}
				System.out.println();
				
				vecesletra+=2;
				distancia--;
			}
			
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Dime qué letra quieres");
			char letra = sc.nextLine().charAt(0);
			letra = Character.toUpperCase(letra);
			dibujinchis(letra);
		}
	
}

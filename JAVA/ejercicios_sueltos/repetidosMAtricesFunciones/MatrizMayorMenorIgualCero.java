package repetidosMAtricesFunciones;

import java.util.Scanner;

public class MatrizMayorMenorIgualCero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número de filas: ");
		int filas =sc.nextInt();
		System.out.println("Introduce el número de columnas: ");
		int columnas =sc.nextInt();
		int [][] valores = new int[filas][columnas];
		int valorSuperior = 0;
		int valorInferior = 0;
		int valorCero = 0;
		
		for (int i = 0; i < valores.length; i++) {
			
			for (int j = 0; j < valores[i].length; j++) {
				valores[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < valores.length; i++) {
			
			for (int j = 0; j < valores[i].length; j++) {
				
				if (valores[i][j] > 0) {
					valorSuperior++;
				}
				
				else if (valores[i][j] < 0) {
					valorInferior++;
				}
				
				else {
					valorCero++;
				}
			}
		}
		
		System.out.println("El total de valores mayores a 0 es de: " + valorSuperior);
		System.out.println("El total de valores menores a 0 es de: " + valorInferior);
		System.out.println("El total de ceros es de: " + valorCero);
	}

}

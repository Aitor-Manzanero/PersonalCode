package repetidosMAtricesFunciones;

import java.util.Scanner;

public class MatrizOficinas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [][] oficinas = new int [3][];
		int mayorConsumo = 0;
		int menorConsumo = 0;
		int plantaMaxCon = 0;
		int plantaMinCon = 0;
		int consumoTotal = 0;
		
		for (int i = 0; i < oficinas.length; i++) {
			System.out.println("Cuántas oficinas hay en la planta número " + i);
			int numOficinas = sc.nextInt();
			oficinas[i] = new int [numOficinas];
		}
		
		for (int i = 0; i < oficinas.length; i++) {
			int consumoPlanta = 0;
			
			for (int j = 0; j < oficinas.length; j++) {
				System.out.println("Introduce el consumo en la oficina " + j + " del piso " + i);
				oficinas[i][j] = sc.nextInt();
				consumoTotal += oficinas[i][j];
				consumoPlanta += oficinas[i][j];
			}
			System.out.println("El consumo de la planta " + i + " es de " + consumoPlanta);
		}
		
		System.out.println("El consumo total es de. " + consumoTotal);
		
		for (int i = 0; i < oficinas.length; i++) {
			
			for (int j = 0; j < oficinas.length; j++) {
				
				if (i == 0 & j == 0) {
					mayorConsumo = oficinas[i][j];
					menorConsumo = oficinas[i][j];
					plantaMaxCon = i;
					plantaMinCon = i;
				}
				
				if (oficinas[i][j] > mayorConsumo) {
					mayorConsumo = oficinas[i][j];
					plantaMaxCon = i;
				}
				
				else if (oficinas[i][j] < menorConsumo) {
					menorConsumo = oficinas[i][j];
					plantaMinCon = i;
				}
			}
		}
		
		System.out.println("La planta con la oficina que menos consume es la " + plantaMinCon + ". La que mas consume está en la " + plantaMaxCon);
		
	}

}

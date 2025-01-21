package repetidosMAtricesFunciones;

import java.util.Scanner;

public class FuncionesSacoSanta {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("A cuántas casas hay que ir?");
		int casas = sc.nextInt();
		String [][] sacoLleno = llenarSaco(casas);
		int opcion;
		
		do {
			opcion = menu();
			
			switch (opcion) {
			case 1: int total = totalRegalos(sacoLleno, casas);
					System.out.println("El total de regalos es de " + total + " para un total de " + casas + " casas");
					break;
					
			case 2: verRegalos(sacoLleno);
					break;
					
			case 3: int casaMayor = casaVIP(sacoLleno);
					System.out.println("La casa con más regalos es la " + (casaMayor+1));					
					break;
					
			case 4: System.out.println("Buen viaje");	
					break;
			
			default: System.out.println("Opción no valida.");
				
			}
		}while (opcion != 4);
		
	}
	
	public static String [][] llenarSaco (int casas) {
		String [][] saco = new String [casas][];
		
		for (int i = 0; i < saco.length; i++) {
			System.out.println("Cuántos regalos van en la casa " + (i+1));
			int regalos = sc.nextInt();
			saco[i] = new String [regalos];
			sc.nextLine(); //Limpiar buffer
			
			for (int j = 0; j < saco[i].length; j++) {
				System.out.println("Introduce el nombre del regalo " + (j+1));
				saco[i][j] = sc.nextLine();
			}
		}
		
		return saco;
	}
	
	public static int menu () {
		System.out.println("El saco ya está listo. ¿Qué quieres hacer?: ");
		System.out.println("1. Ver el total de regalos");
		System.out.println("2. Mostrar todos los regalos");
		System.out.println("3. ¿Qué casa tendrá más regalos?");
		System.out.println("4. Salir a repartir los regalos");
		return sc.nextInt();
	}
	
	public static int totalRegalos (String[][] sacoLleno, int casas) {
		int sumRegalos = 0;
		for (int i = 0; i < casas; i++) {
			sumRegalos += sacoLleno[i].length;
			}
	return sumRegalos;
	}
	
	public static void verRegalos (String[][] sacoLleno) {
		for (int i = 0; i < sacoLleno.length; i++) {
			System.out.println("Regalos de la casa " + (i+1));
			System.out.println("-----------------");
			System.out.println("-----------------");
			
				for (int j = 0; j < sacoLleno[i].length; j++) {
					System.out.println((j+1) + " " + sacoLleno[i][j]);
				}
			System.out.println("-----------------");
			System.out.println("-----------------");
		}
	}
	
	public static int casaVIP (String[][] sacoLleno) {
		int max = 0;
		int posicion = 0;
		
		for (int i = 0; i < sacoLleno.length; i++) {	
			if (i == 0) {
				max = sacoLleno[i].length;
				posicion = i;
			}
			else if (sacoLleno.length > max) {
				max = sacoLleno[i].length;
				posicion = i;
			}
		}
		return posicion;
	}

}

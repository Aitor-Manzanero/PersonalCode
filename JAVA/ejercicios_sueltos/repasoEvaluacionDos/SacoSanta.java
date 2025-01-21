package repasoEvaluacionDos;

import java.util.Arrays;
import java.util.Scanner;

public class SacoSanta {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("A cuántas casas tiene que ir?");
		int numCasas = sc.nextInt();
		sc.nextLine(); //Limpia el buffer
		int [] regalos = regalos (numCasas);
		int opcion;
		String [][] nombreRegalo = nombreRegalo(regalos);
		
		do {
			opcion = menu();
			switch (opcion) {
	            case 1:
	            	System.out.print(" El total de regalos es ");
	                totalRegalos(regalos); //No hay que especificar el tipo. Aunque regalos sea un array de enteros, no se escribe int [] regalos.
	                break;
	            case 2:
	            	for (int i = 0; i < numCasas; i++) {
	            		System.out.println("Regalos de la casa " + (i+1));
	            		for (int j = 0; j <regalos[i]; j++)
	            		{
	            			System.out.println(nombreRegalo[i][j]);
	            		}
	            	}
	            	break;
	            case 3:
	            	System.out.print("La casa con más regalos es la que ocupa la posición ");
	                mayor(regalos);
	                System.out.print(" del array");
	                break;
	            case 4:
	                System.out.println("Buen viaje!");
	                break;
	            default:
	                System.out.println("Opción incorrecta");
	                break;
			}
			System.out.println();
			} while (opcion != 4);
		
	}

		public static int [] regalos (int numCasas) {
			Scanner sc = new Scanner(System.in);
			int [] regalos = new int [numCasas];
			// String [][] nombreRegalo = new String [numCasas][];
			
			for (int i = 0; i <numCasas; i++)
			{
				System.out.println("Introduce cuántos regalos van en la casa " + (i + 1));
				regalos[i] = sc.nextInt();
			}
			return regalos;
		}	
		
		public static String [][] nombreRegalo(int [] regalos) {
			Scanner sc = new Scanner(System.in);
			String [][] nombreRegalo = new String [regalos.length][];
			for (int i = 0; i <regalos.length; i++)
			{
				
				nombreRegalo[i] = new String[regalos[i]]; //Necesito explicación de esto
				
				for (int j = 0; j < regalos[i]; j++) {
					System.out.println("Introduce el nombre del regalo número " + (j + 1) + " de la casa " + (i+1));
					nombreRegalo[i][j] = sc.nextLine();
				}
			}
			return nombreRegalo;
		}
		
		public static int menu () {
			Scanner sc = new Scanner(System.in);
			System.out.println("1. Ver el total de regalos.");
			System.out.println("2. Mostrar todos los regalos.");
			System.out.println("3. ¿Qué casa tendrá más regalos?");
			System.out.println("4. Salir a repartir regalos.");
			return sc.nextInt();
		}
		
		public static void totalRegalos (int[] regalos){
			int total = 0;
			
			for (int i = 0; i < regalos.length; i++) {
				total += regalos[i];
			}
			System.out.println(total);
		}
		
		
		public static void totalRegalosCasa (String [][] nombreRegalo) {
			System.out.println(Arrays.deepToString(nombreRegalo));
		}
		
		public static void mayor (int[] regalos) {
			int mayor = 0;
			int posicion = 0;
			
			for (int i = 0; i < regalos.length; i++)
			{
				if (i == 0) {
					mayor = regalos[i];
					posicion = i;
				}
				if (regalos[i] > mayor) {
					mayor = regalos[i];
					posicion = i;
				}
			}
			System.out.print(posicion);
		}

}

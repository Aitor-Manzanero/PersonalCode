package repetidosMAtricesFunciones;

import java.util.Scanner;

public class MatrizSueldos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el total de personas: ");
		int total = sc.nextInt();
		int[][] sueldos = new int[total][2];
		int sumaHombres = 0;
		int sumaMujeres = 0;
		int contHombres = 0;
		int contMujeres = 0;
		
		
		for (int i = 0; i < sueldos.length; i++) {
				System.out.println("Introduce el sueldo: ");
				sueldos[i][0] = sc.nextInt();
				System.out.println("Introduce el sexo. 0 para hombre, 1 para mujer: ");
				sueldos[i][1] = sc.nextInt();
				
				if (sueldos[i][1] == 0) {
					sumaHombres += sueldos[i][0];
					contHombres++;
				}
				else {
					sumaMujeres += sueldos [i][0];
					contMujeres++;
				}
		}
		System.out.println("La media de sueldo de los hombres es de: " + (sumaHombres/contHombres) );
		System.out.println("La media de sueldo de las mujeres es de: " + (sumaMujeres/contMujeres) );
	}

}

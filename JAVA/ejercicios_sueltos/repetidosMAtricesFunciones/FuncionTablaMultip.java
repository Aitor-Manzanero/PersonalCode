package repetidosMAtricesFunciones;

import java.util.Arrays;
import java.util.Scanner;

public class FuncionTablaMultip {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número entero :");
		int num = sc.nextInt();
		
		System.out.println(Arrays.toString(tablaMultiplicar(num)));
	}
	
	public static int [] tablaMultiplicar (int num) {
		int [] tablaMultiplicar = new int [10];
		
		for (int i = 0; i < tablaMultiplicar.length; i++) {
			tablaMultiplicar[i] = num*(i+1);
			
		}
		
		return tablaMultiplicar;
	}

}

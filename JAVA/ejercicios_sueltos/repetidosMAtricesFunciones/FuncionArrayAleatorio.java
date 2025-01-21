package repetidosMAtricesFunciones;

import java.util.Arrays;
import java.util.Scanner;

public class FuncionArrayAleatorio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce el tamaño del array");
		int tamanio = sc.nextInt();
		
		System.out.println(Arrays.toString(rellenaArray(tamanio)));
	}
	
	public static double [] rellenaArray (int tamanio) {
		
		double [] arrayRelleno = new double [tamanio];
		
		for (int i = 0; i < arrayRelleno.length; i++) {
			arrayRelleno[i] = Math.random();
		}
		
		return arrayRelleno;
	}
	
}

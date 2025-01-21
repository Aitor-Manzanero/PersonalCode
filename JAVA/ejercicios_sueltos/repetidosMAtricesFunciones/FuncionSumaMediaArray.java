package repetidosMAtricesFunciones;

import java.util.Scanner;

public class FuncionSumaMediaArray {

	public static void main(String[] args) {
		int [] arrayNatural = new int [100];
		
		for (int i = 0; i < arrayNatural.length; i++) {
			arrayNatural[i] = i+1;
		}
		
		
		int suma = suma(arrayNatural);
		System.out.println(suma);
		System.out.println(media (suma, arrayNatural));
		
	}
	
	public static int suma (int [] array) {
		int suma = 0;
	
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
		}
		
		return suma;
	}
	
	public static double media (int numerador, int [] array) {
		return numerador / array.length;
	}

}

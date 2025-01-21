package repetidosMAtricesFunciones;

import java.util.Scanner;

public class FuncionSumatorioProductorioMedio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número entero: ");
		int num = sc.nextInt();
		
		System.out.println(suma1aN(num));
		System.out.println(producto1aN(num));
		System.out.println(intermedio1aN(num));
	}
	
	public static int suma1aN(int n) {
		int suma = 0;
		
		for (int i = 1; i <= n; i++) {
			suma += n;
		}
		return suma;
	}
	
	public static int producto1aN(int n) {
		int producto = 1;
		
		for (int i = 1; i <= n; i++) {
			producto *= i;
		}
		
		return producto;
	}
	
	public static double intermedio1aN(int n) {
		return (n+1)/2;
	}

}

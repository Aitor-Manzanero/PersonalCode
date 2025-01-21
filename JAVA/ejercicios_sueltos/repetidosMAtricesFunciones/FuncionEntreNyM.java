package repetidosMAtricesFunciones;

import java.util.Scanner;

public class FuncionEntreNyM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número entero");
		int N = sc.nextInt();
		System.out.println("Introduce otro número entero");
		int M = sc.nextInt();
		System.out.println("Introduce un número");
		int num = sc.nextInt();
		intervalo(N,M,num);
		
	}
	
	public static void intervalo(int n, int m, int numero) {
		if (n < m) {
			if (numero >= n & numero <= m) {
				System.out.println("El número a comprobar está entre los dos primeros");
			}
			else {
				System.out.println("El número a comprobar no está entre los dos primeros");
			}
		}
		
		else {
			if (numero <=n & numero >=m) {
				System.out.println("El número a comprobar está entre los dos primeros");
			}
			else {
				System.out.println("El número a comprobar no está entre los dos primeros");
			}
		}
	}

}

package repetidosMAtricesFunciones;

import java.util.Scanner;

public class SumaNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce hasta qué número quieres sumar");
		int num = sc.nextInt();
		System.out.println(sumaNumeros(num));
	}
	
	public static int sumaNumeros (int a) {
		if (a == 1) {
			return 1;
		}
		else {
			return a + sumaNumeros(a-1);
		}
	}

}

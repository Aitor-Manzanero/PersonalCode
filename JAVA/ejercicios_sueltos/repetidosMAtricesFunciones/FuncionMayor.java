package repetidosMAtricesFunciones;

import java.util.Scanner;

public class FuncionMayor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer valor: ");
		int a = sc.nextInt();
		System.out.println("Introduce el segundo valor: ");
		int b = sc.nextInt();
		System.out.println("Introduce el tercer valor: ");
		int c = sc.nextInt();

		int mayorTemporal = mayor (a,b);
		System.out.println(mayor (mayorTemporal, c));
		
	}
	
	public static int mayor (int num1, int num2) {
		
		if (num1 > num2) {
			return num1;
		}
		
		else {
			return num2;
		}
	}

}

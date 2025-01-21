package repetidosMAtricesFunciones;

import java.util.Scanner;

public class FuncionFechaCorrecta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el día: ");
		int dia = sc.nextInt();
		System.out.println("Introduce el mes (número): ");
		int mes = sc.nextInt();
		System.out.println("Introduce el año: ");
		int anio = sc.nextInt();
		
		if (fechaCorrecta (dia, mes, anio) == true) {
			System.out.println("El formato de fecha es válido");
		}
		
		else {
			System.out.println("El formato no es valido");
		}
	}
	
	public static boolean fechaCorrecta (int dia, int mes, int anio) {
	
		if (dia < 0 | dia > 30) {
			return false;
		}
		
		else if (mes < 1 | mes >12) {
			return false;
		}
		
		else {
			return true;
		}
	}

}

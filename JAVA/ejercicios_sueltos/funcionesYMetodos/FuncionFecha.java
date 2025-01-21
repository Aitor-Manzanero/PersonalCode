/* Realiza un programa que lea una fecha introduciendo el día, mes y año por separado y nos diga si
la fecha es correcta o no. Supondremos que todos los meses tienen 30 días. Se debe crear una
función donde le pasemos los datos y devuelva si es correcta o no. */

package funcionesYMetodos;

import java.util.Scanner;

public class FuncionFecha {
	
	public static boolean fechaCorrecta (int dia, int mes, int anio)
	{
		if (dia < 0 | dia > 30)
		{
			return false;
		}
		else if (mes < 0 | mes > 12)
		{
			return false;
		}
		else
		{
			return true;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el día:");
		int dia = sc.nextInt();
		System.out.println("Introduce el mes:");
		int mes = sc.nextInt();
		System.out.println("Introduce el año:");
		int anio = sc.nextInt();
		
		if (fechaCorrecta(dia, mes, anio))
		{
			System.out.println("La fecha es valida");
		}
		else {
			System.out.println("La fecha no es valida");
		}
	}

}

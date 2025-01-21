package repetidosMAtricesFunciones;

import java.util.Scanner;

public class FuncionesNombreTrineos {

	public static void main(String[] args) {
		String [] nombres = {"cometa", "relámpago", "estrella"};
		String [] adjetivos = {"veloz", "fugaz", "brillante"};
		Scanner sc = new Scanner(System.in);
		int continuar;
		
		do {
			generaNombres(nombres, adjetivos);
			System.out.println("Quieres volver a generar un nombre? Introduce cualquier número entero para continuar. Introduce -1 para salir.");
			continuar = sc.nextInt();
		} while (continuar != -1);
		
	}
	
	public static void generaNombres(String[] nombre, String[] adjetivo) {
		System.out.println(nombre[(int) (Math.random()*nombre.length)] + " " + adjetivo[(int) (Math.random()*nombre.length)] );
	}
	

}

package repetidosMAtricesFunciones;

import java.util.Scanner;

public class NotasAlumnos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double [][] notasAlumnos = new double [4][5];
		double minima = 0;
		double maxima = 0;
		double media = 0;
		double suma = 0;
		
		for (int i = 0; i < notasAlumnos.length; i++) {
			
			for (int j = 0; j < notasAlumnos[i].length; j++) {
				System.out.println("Introduce la nota del alumno " + (i +1) + " para la asignatura " + (j+1));
				notasAlumnos[i][j] = sc.nextDouble();
				suma += notasAlumnos[i][j];
				
				if (j==0) {
					minima = notasAlumnos[i][j];
					maxima = notasAlumnos[i][j];
				}
				if (notasAlumnos[i][j] < minima) {
					minima = notasAlumnos[i][j];
				}

				if (notasAlumnos[i][j] > maxima) {
					maxima = notasAlumnos[i][j];
				}
			}
			System.out.println("La nota mínima del alumno" + (i+1) + " es: " + minima);
			System.out.println("La nota máxima del alumno" + (i+1) + " es: " + maxima);
			System.out.println("La nota del alumno" + (i+1) + " es: " + (suma/notasAlumnos[i].length));
			suma = 0;
		}
	}
}	
		
package repasoEvaluacionDos;

import java.util.Scanner;

public class NombreTrineos {

	public static void renardos() {
			String [] nombre = {"cometa", "relámpago", "estrella"};
			String [] adjetivo = {"veloz", "fugaz", "brillante"};
			int posicion1 = (int) (Math.random()*3);
			int posicion2 = (int) (Math.random()*3);;
			System.out.println(nombre[posicion1] + " " + adjetivo[posicion2]);
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			System.out.println("Bienvenido al creador de nombres para tus renos. Generaré nombres por cada número que introduzcas hasta que escribas -1");
			int num= sc.nextInt();
			
			while (num!=-1) {
				renardos();
				num = sc.nextInt();
			}	
		}
}

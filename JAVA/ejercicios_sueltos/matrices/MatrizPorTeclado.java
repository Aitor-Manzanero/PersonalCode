/* Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por teclado) e
introduzca en ella NxM valores (también introducidos por teclado). Luego deberá recorrer la
matriz y al final mostrar por pantalla cuántos valores son mayores que cero, cuántos son
menores que cero y cuántos son igual a cero.*/

package matrices;

import java.util.Scanner;

public class MatrizPorTeclado {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce el tamaño de la primera dimensión del array");
		int N = sc.nextInt();
		System.out.println("Introduce el tamaño de la segunda dimensión del array");
		int M = sc.nextInt();
		int [][] matriz = new int [N][M];
		
		for (int i = 0; i < matriz.length; i++)
		{
			for (int j = 0; j < matriz[i].length; j++)
			{
				System.out.println("Introduce el valor de la posición " + i + " " + j);
				matriz[i][j]=sc.nextInt();
			}
		}
		
		int contMayor=0;
		int contMenor=0;
		int contIgual=0;
		
		for (int i = 0; i < matriz.length; i++)
		{
			for (int j = 0; j < matriz[i].length; j++)
			{
				if (matriz[i][j]<0)
				{
					contMenor++;
				}
				else if (matriz[i][j]>0)
				{
					contMayor++;
				}
				else
				{
					contIgual++;
				}
			}
		}
		
		System.out.println("Mayores que 0: " + contMayor);
		System.out.println("Menores que 0: " + contMenor);
		System.out.println("Iguales a 0: " + contIgual);
	}

}

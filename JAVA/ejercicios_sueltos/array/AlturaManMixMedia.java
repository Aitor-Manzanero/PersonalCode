/* Crea un programa para realizar cálculos relacionados con la altura (en metros) de personas.
Pedirá un valor N y luego almacenará en un array N alturas introducidas por teclado. Luego
mostrará la altura media, máxima y mínima así como cuántas personas miden por encima y
por debajo de la media. */

package array;

import java.util.Scanner;

public class AlturaManMixMedia {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Cuántas alturas quieres almacenar?");
		int N=sc.nextInt();
		double [] alturas = new double [N];
		double max=0;
		double min=0;
		double suma=0;
		double media=0;
		int encima=0;
		int debajo=0;
		
		
		for (int i=0; i<alturas.length; i++)
		{
			alturas[i]=sc.nextDouble();
			suma+=alturas[i];
			
			if(i==0)
			{
				max=alturas[i];
				min=max;
			}
			else if(alturas[i]>max)
			{
				max=alturas[i];
			}
			else if(alturas[i]<min)
			{
				min=alturas[i];
			}
			
			if(i+1==alturas.length)
			{
				media=suma/(i+1);
			}
		}
		
		for (int i=0; i<alturas.length; i++)
		{
			if(alturas[i]>media)
			{
				encima++;
			}
			else if(alturas[i]<media)
			{
				debajo++;
			}
		}
		
		System.out.println("La altura mínima es: " + min);
		System.out.println("La altura máxima es: " + max);
		System.out.println("La media es: " + media);
		System.out.println("hay " + encima + " personas por encima de la media, y por debajo hay " + debajo);
	}

}

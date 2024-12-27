package estructuras_repetitivas;
import java.util.Scanner;
public class CantidadParesNaM {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un número");
		int num1=sc.nextInt();
		System.out.println("Introduce otro número, mayor que el anterior");
		int num2=sc.nextInt();
		int contPar=0;
		for (int i=num1;i<=num2;i++)
		{
			System.out.print(i + " ");
			if(i%2==0)
			{
				contPar++;
			}
		}
		System.out.println();
		System.out.println("Números pares: " + contPar);
	}

}

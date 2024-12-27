package estructuras_repetitivas;
import java.util.Scanner;
public class numeros_sucesivos {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un número entero mayor o igual a 1");
		int num=sc.nextInt();
		int cont=1;
		if(num<=0)
		{
			System.out.println("Número no válido");
		}
		else
		{
			while(cont<=num)
			{
				System.out.print(cont + " ");
				cont++;
			}

		}
	}

}

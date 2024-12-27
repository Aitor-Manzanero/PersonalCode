package estructuras_repetitivas;
import java.util.Scanner;
public class EscaleraNumeros {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un numero entero entre el 0 y el 20");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			System.out.println();
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
		}
	}

}

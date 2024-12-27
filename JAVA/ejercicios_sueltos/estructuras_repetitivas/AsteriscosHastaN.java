package estructuras_repetitivas;
import java.util.Scanner;
public class AsteriscosHastaN {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Introduce un número");
		int num=sc.nextInt();
		if(num<=0)
		{
			System.out.println("*");
		}
		else
		{
			for(int i=1;i<=num;i++)
			{
				System.out.print("*");
			}
		}
		
	}

}

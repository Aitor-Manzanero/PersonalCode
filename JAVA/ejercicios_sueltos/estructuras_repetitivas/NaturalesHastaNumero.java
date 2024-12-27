package estructuras_repetitivas;
import java.util.Scanner;
public class NaturalesHastaNumero {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Introduce un número");
		int num1=sc.nextInt();
		for(int i=1;i<=num1;i++)
		{
			System.out.println(i);
		}
	}

}

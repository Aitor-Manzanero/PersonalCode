package estructuras_repetitivas;
import java.util.Scanner;
public class suma_digitos {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un número");
		int num=sc.nextInt();
		int sum=0;
		int temp=0;
		while (num>0)
		{
			sum+=num%10;
			num=num/10;
			
		}
		System.out.println(sum);
	}

}

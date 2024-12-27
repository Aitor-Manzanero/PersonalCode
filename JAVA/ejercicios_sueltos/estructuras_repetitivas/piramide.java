package estructuras_repetitivas;
import java.util.Scanner;
public class piramide {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime un número");
		int num=sc.nextInt();
		int x=1;
		int s=1;
		for(int i=1;i<=num;i++)
		{
			for (int k=x;k<=num;k++)
			{
				System.out.print(" ");
			}
			for (int j=1;j<=s;j++)
			{
				System.out.print("*");
			}
			s+=2;
			x++;
			System.out.println("");
			
		}
	}

}

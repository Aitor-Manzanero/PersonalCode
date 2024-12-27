package ejercicios_sueltos;
import java.util.Scanner;
public class MayorYMenor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un número");
		int num1=sc.nextInt();
		System.out.println("Introduce otro número");
		int num2=sc.nextInt();
		if(num1>num2)
		{
			System.out.println(num1);
			System.out.println(num2);
		}
		else if(num1==num2)
		{
			System.out.println("Son iguales");
		}
		else
		{
			System.out.println(num2);
			System.out.println(num1);
		}
	}

}

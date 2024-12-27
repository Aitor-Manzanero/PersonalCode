package ejercicios_sueltos;
import java.util.Scanner;
public class OperacionesBasicas {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un número");
		int num1=sc.nextInt();
		System.out.println("Introduce otro número");
		int num2=sc.nextInt();
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println((double)num1/num2);
	}

}

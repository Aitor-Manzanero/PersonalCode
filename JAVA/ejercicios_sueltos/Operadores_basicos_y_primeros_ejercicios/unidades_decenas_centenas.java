package temaDos;
import java.util.Scanner;
public class A2_11Secuenciales3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un número entero de tres cifras");
		int num=sc.nextInt();
		int C,D,U;
		C=num/100;
		D=(num/10)%10;
		U=num%10;	
		System.out.println(C + "," + D + "," + U + ".");
	}

}

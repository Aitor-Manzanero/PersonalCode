package ejercicios_sueltos;
import java.util.Scanner;
public class extraer_numeros_suerte {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el día en que naciste");
		int D=sc.nextInt();
		System.out.println("Introduce el número de mes en que naciste");
		int M=sc.nextInt();
		System.out.println("Introduce el año en que naciste");
		int A=sc.nextInt();
		int suma=D+M+A;
		int suerte=(suma/1000)+((suma/100)%10)+((suma/10)%10)+(suma%10);
		System.out.println(suerte);
	}

}

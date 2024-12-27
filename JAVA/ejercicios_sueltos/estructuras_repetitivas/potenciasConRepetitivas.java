package estructuras_repetitivas;
import java.util.Scanner;
public class potenciasConRepetitivas {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce la base");
		int base=sc.nextInt();
		System.out.println("Introduce el exponente");
		int exponente=sc.nextInt();
		int total=1;
		for (int i=1;i<=exponente;i++)
		{
			total*=base;
		}
		System.out.println(total);
	}

}

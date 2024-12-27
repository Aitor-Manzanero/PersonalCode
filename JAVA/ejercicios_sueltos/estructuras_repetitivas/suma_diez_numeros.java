package estructuras_repetitivas;
import java.util.Scanner;
public class suma_diez_numeros {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int Acum=0;
		int i=0;
		for (i=0;i<10;i++)
		{
			System.out.println("Introduce un número");
			int Num=sc.nextInt();
			Acum+=Num;
		}
		System.out.println("La suma es " + Acum + " y la media es " + Acum/i);
	}

}

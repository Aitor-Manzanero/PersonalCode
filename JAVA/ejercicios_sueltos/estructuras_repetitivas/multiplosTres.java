package estructuras_repetitivas;
import java.util.Scanner;
public class multiplosTres {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un número");
		int num=sc.nextInt();
		int cont=0;
		for (int i=3;i<num;i=i+3) //Podría hacerse más sencillo al hacer num/cont como un int (quitar los decimales).
		{
			cont++;
		}
		System.out.println(cont);
	}
	
}

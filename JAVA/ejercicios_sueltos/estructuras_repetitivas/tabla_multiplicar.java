package estructuras_repetitivas;
import java.util.Scanner;
public class tabla_multiplicar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un número del 1 al 10");
		int num=sc.nextInt();
		int cont=1;
		/* for(int i=1;i<=12;i++)
		{
			System.out.println(num*i);
		}
		*/
		while(cont<=12)
		{
			System.out.println(num + "x" + cont + "=" + cont*num);
			cont++;
		}
	}

}

package estructuras_repetitivas;
import java.util.Scanner;
public class es_primo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un número entero. Recuerda que solo los números positivos pueden ser primos. Cuando quieras salir del programa, introduce -1");
		int num=sc.nextInt();
		while(num!=-1)
			{
			int primalidad=0;
			for(int i=1;i<=num;i++)
				{
				int res=num%i;
				if(res==0)
					{
						primalidad++;
					}
				}
				if(primalidad==2)
				{
					System.out.println(num + " es primo");
					System.out.println("Introduce un nuevo número");
					num=sc.nextInt();
				}
				else
				{
					System.out.println(num + " no es primo");
					System.out.println("Introduce un nuevo número");
					num=sc.nextInt();
				}
		}	
	}
}

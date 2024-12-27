package estructuras_repetitivas;
import java.util.Scanner;
public class NumerosValidos {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean negativo=false;
		for(int i=1;i<=10;i++)
		{
			System.out.println("Introduce un número");
			int num1=sc.nextInt();
			if(num1<0)
			{
				negativo=true;
			}
		}
		if(negativo==false)
		{
			System.out.println("Todos los números son 0 o positivos");	
		}
		else
			System.out.println("Al menos un número es negativo");
	}

}

package estructuras_repetitivas;
import java.util.Scanner;
public class MayorCadaVez {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=0;
		int anterior=0;
		int cont=0;
		int contfallo=0;
		do
		{
			System.out.print("Introduce un número");	
			anterior=num;
			num=sc.nextInt();
			if(num<anterior && num!=0)
			{
				System.out.println("Fallo. Es menor");
				anterior=0;
				cont++;
				contfallo++;
			}
			else if(num>anterior)
			{
				cont++;
			}
		}while(num!=0);
		System.out.println("Total de números introducidos " + cont);
		System.out.println("Números fallados " + contfallo);	
	}
}

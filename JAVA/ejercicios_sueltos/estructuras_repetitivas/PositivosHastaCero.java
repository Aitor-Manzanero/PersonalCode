package estructuras_repetitivas;
import java.util.Scanner;
public class PositivosHastaCero {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int contPos=0;
		int contNeg=0;
		int num;
		do
		{
			System.out.println("Introduce un número");
			num=sc.nextInt();
			if(num>0)
			{
				contPos++;
			}
			if(num<0)
			{
				contNeg++;
			}
		}while(num!=0);
		System.out.println("Total de números positivos: " + contPos);
		System.out.println("Total de números negativos: " + contNeg);

	}

}

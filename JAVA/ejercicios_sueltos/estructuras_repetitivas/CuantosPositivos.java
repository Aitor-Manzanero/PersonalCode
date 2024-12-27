package estructuras_repetitivas;
import java.util.Scanner;
public class CuantosPositivos {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int contPos=0;
		int contNeg=0;
		for(int i=1;i<=10;i++)
			
		{
			System.out.println("Introduce un número");
			int num=sc.nextInt();
			if(num>0)
			{
				contPos++;
			}
			if(num<0)
			{
				contNeg++;
			}
		}
		System.out.println(contPos +" son positivos, y " + contNeg + " son negativos.");
	}

}

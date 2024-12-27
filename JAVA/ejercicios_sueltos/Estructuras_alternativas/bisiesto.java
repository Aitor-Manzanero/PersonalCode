package estructuras_alternativas;
import java.util.Scanner;
public class bisiesto {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el año para saber si es bisiesto.");
		int ano=sc.nextInt();
		if(ano%4==0 && !(ano%100==0 && ano%400!=0))
		{
			System.out.println("El año es bisiesto");
		}
		else
		{
			System.out.println("El año no es bisiesto");
		}
		sc.close();
	}

}

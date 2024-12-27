package ejercicios_sueltos;
import java.util.Scanner;
public class MayorDeEdad {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce la edad");
		int edad=sc.nextInt();
		if(edad>=18)
		{
			System.out.println("Eres mayor de edad");
		}
		else if(edad<0)
		{
			System.out.println("Edad no válida");
		}
		else
		{
			System.out.println("Eres menor de edad");
		}
	}

}

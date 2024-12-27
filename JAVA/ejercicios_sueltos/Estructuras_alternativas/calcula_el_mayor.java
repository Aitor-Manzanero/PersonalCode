package estructuras_alternativas;
import java.util.Scanner;
public class calcula_el_mayor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un número entero");
		int num1=sc.nextInt();
		System.out.println("Introduce el segundo número entero");
		int num2=sc.nextInt();
		System.out.println("Introduce el último número entero");
		int num3=sc.nextInt();
		if(num1>num2 && num1>num3) {
			System.out.println(num1 + " es el mayor de los tres");
		}
		else if(num2>num1 && num2>num3) {
			System.out.println(num2 + " es el mayor de los tres");
		}
		else if(num3>num1 && num3>num2) {
			System.out.println(num3 + " es el mayor de los tres");
		}
		else {
			System.out.println("El número mayor está repetido");
		}
		sc.close();
	}

}

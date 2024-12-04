package ejercicios_sueltos;
import java.util.Scanner;
public class scanner_operaciones_circulo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el valor del radio del círculo");
		int radio= sc.nextInt();
		final double pi=3.14159;
		System.out.println("La longitud es de " + 2*pi*radio);
		System.out.println("El área es de " + pi*radio*radio);
	}

}

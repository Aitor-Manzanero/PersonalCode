package ejercicios_sueltos;
import java.util.Scanner;
public class datos_numero_alternativa {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un número entero");
		int num=sc.nextInt();
		System.out.println((num>=0)?"Es positivo":"es negativo");
		System.out.println((num%2==0)?"Es par":"es impar");
		System.out.println((num%5==0)?"Es múltiplo de 5": "No es múltiplo de 5");
		System.out.println((num%10==0)?"Es múltiplo de 10": "No es múltiplo de 10");
		System.out.println((num<100)?"Es menor que 100":"es mayor que 100");
	}

}

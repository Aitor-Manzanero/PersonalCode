package estructuras_alternativas;
import java.util.Scanner;
public class division {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un número");
		double num1=sc.nextDouble();
		System.out.println("Introduce otro número");
		double num2=sc.nextDouble();
		if(num2==0) {
			System.out.println("El segundo número no puede ser cero");
		}
		else {
			System.out.println(num1/num2);
		}
		sc.close();
	}

}

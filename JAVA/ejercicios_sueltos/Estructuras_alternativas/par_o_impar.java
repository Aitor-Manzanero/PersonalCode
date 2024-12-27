package estructuras_alternativas;
import java.util.Scanner;
public class par_o_impar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un número entero");
		int num=sc.nextInt();
		if(num%2==0) {
			System.out.println("Es par");
		}
		else {
			System.out.println("Es impar");
		}
		sc.close();
	}

}

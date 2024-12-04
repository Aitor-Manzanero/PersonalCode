package ejercicios_sueltos;
import java.util.Scanner;
public class numero_entero_aleatorio {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un número entero mayor que 1");
		int num=sc.nextInt();
		int aleat=(int) (Math.random()*num)+1;
		System.out.println(aleat);
	}

}

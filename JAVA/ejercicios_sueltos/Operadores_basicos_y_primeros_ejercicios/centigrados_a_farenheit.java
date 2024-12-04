package ejercicios_sueltos;
import java.util.Scanner;
public class centigrados_a_farenheit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce los grados centígrados");
		Double cent=sc.nextDouble();
		System.out.println(cent + " equivalen a " + ((9*cent/5)+32) + " Farenheit");
	}

}

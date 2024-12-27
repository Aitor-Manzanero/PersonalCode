package ejercicios_sueltos;
import java.util.Scanner;
public class MarinasAMetros {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		final double equivalencia=1852;
		System.out.println("Introduce el valor en millas marinas");
		double milla=sc.nextInt();
		System.out.println("Equivalen a " + milla*equivalencia);
	}

}

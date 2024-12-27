package ejercicios_sueltos;
import java.util.Scanner;
public class ConocerDescuento {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el precio antes de descuento");
		double total=sc.nextInt();
		System.out.println("Introduce el precio despues del descuento");
		double pagado=sc.nextInt();
		double descuento=(pagado/total)*100;
		System.out.println(100-descuento);
	}

}

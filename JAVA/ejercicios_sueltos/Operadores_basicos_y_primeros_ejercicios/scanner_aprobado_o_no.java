package ejercicios_sueltos;
import java.util.Scanner;
public class scanner_aprobado_o_no {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce la nota obtenida");
		double nota=sc.nextDouble();
		String texto=(nota>=5)?"Has aprobado":"has suspendido";
		System.out.println(texto);
	}

}

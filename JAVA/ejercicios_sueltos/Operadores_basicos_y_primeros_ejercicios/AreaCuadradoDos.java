package ejercicios_sueltos;
import java.util.Scanner;
public class AreaCuadradoDos {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce la longitud del lado");
		int lado=sc.nextInt();
		System.out.println("El area es de: " + lado*lado);
	}

}

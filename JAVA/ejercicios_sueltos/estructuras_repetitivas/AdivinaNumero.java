package estructuras_repetitivas;
import java.util.Scanner;
public class AdivinaNumero {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Piensa un número del 1 al 100");
		boolean resuelto=false;
		int max=100;
		int min=1;
		while(resuelto==false)
		{
			int propuesta=(max+min)/2;
			System.out.println("¿Tu número es " + propuesta + " ?.");
			System.out.println("Si es mayor escribe '>', si es menor escribe '<' y si he acertado escribe '='");
			String respuesta=sc.nextLine();
			switch(respuesta)
			{
				case "<":
					max=propuesta-1;
					break;
				case ">":
					min=propuesta+1;
					break;	
				case "=":
					resuelto=true;
					break;	
				default:System.out.println("Respuesta no válida. Introduce <, > o =");
					break;
			}
		}
		System.out.println("Lo he adivinado!!");
	}

}

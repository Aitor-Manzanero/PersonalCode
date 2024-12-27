package estructuras_alternativas;
import java.util.Scanner;
public class postulante {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce la cantidad de preguntas realizadas");
		int preguntas=sc.nextInt();
		System.out.println("Introduce la cantidad de preguntas contestadas correctamente");
		int aciertos=sc.nextInt();
		double porcentaje=((double)aciertos/preguntas)*100;
		if(porcentaje>=90)
		{
			System.out.println("Nivel máximo");
		}
		else if(porcentaje>=75 && porcentaje <90)
		{
			System.out.println("Nivel medio");
		}
		else if(porcentaje>=50 && porcentaje<75)
		{
			System.out.println("Nivel regular");
		}
		else
		{
			System.out.println("Fuera de nivel");
		}
		sc.close();
	}

}

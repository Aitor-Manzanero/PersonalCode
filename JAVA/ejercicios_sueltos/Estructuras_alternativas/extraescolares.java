package estructuras_alternativas;
import java.util.Scanner;
public class extraescolares {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el día de la semana, en minúsculas y sin acentos");
		String actividad="";
		String dia=sc.nextLine();
		switch (dia)
		{
		case "lunes":actividad="Psicomotridicad";
					break;
		case "martes":actividad="Natación";
					break;
		case "miercoles":actividad="Música";
					break;
		case "jueves":actividad="Natación";
					break;
		case "viernes":actividad="Descanso";
		case "sabado": 
		case "domingo": actividad="Día sin actividades";
		break;
		default:
			System.out.println("Día erróneo");
		}
		System.out.println(actividad);
		sc.close();
	}

}

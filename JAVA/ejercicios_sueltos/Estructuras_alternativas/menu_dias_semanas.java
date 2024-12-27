package estructuras_alternativas;
import java.util.Scanner;
public class menu_dias_semanas {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el número del mes, sabiendo que enero corresponde a 1 y diciembre a 12");
		int mes=sc.nextInt();
		String nombre="";
		int dias=0;
		switch (mes) 
		{
		case 1: nombre="Enero";
				dias=31;
				break;
		case 2:	nombre="Febrero";
				dias=28;
				break;
		case 3: nombre="Marzo";
				dias=31;
				break;
		case 4: nombre="Abril";
				dias=30;
				break;
		case 5: nombre="Mayo";
				dias=31;
				break;
		case 6: nombre="Junio";
				dias=30;
				break;
		case 7: nombre="Julio";
				dias=31;
				break;
		case 8: nombre="Agosto";
				dias=31;
				break;
		case 9: nombre="Septiembre";
				dias=30;
				break;
		case 10:nombre="Octubre";
				dias=31;
				break;
		case 11:nombre="Noviembre";
				dias=30;
				break;
		case 12:nombre="Diciembre";
				dias=31;
				break;
		default: System.out.println("Mes no válido");		
		}
		if(mes>=1 && mes<=12)
		{	
		System.out.println(nombre + " tiene " + dias + " días.");
		}
		sc.close();
	}

}

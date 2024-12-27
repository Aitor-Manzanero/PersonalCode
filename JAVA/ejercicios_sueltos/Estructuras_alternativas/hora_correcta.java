package tema3_Alternativas;
import java.util.Scanner;
public class hora_correcta {

	public static void main(String[] args) {
		int H, M, S;
		Scanner sc= new Scanner(System.in);
		System.out.println("Escribe la hora");
		H=sc.nextInt();
		if(H<0 || H>=24) {
			System.out.println("Hora no válida");
		}
		else {
			System.out.println("Escribe los minutos");
			M=sc.nextInt();
			if (M<0 || M>59) {
				System.out.println("Hora no válida");
			}
			else{
				System.out.println("Escribe los segundos");
				S=sc.nextInt();
				
				if (S<0 || S>59) {
					System.out.println("Hora no válida");
				}
				else {
					System.out.println("La hora es válida");
				}
			

			}

		}
		sc.close();
	}
}
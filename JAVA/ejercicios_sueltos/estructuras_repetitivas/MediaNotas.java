package temaTres;
import java.util.Scanner;
public class MediaNotas {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int nota;
		int contperfecto=0;
		do
		{
			System.out.println("Introduce una nota. -1 para salir");
			nota=sc.nextInt();
			if(nota==10)
			{
				contperfecto++;
			}
		}while(nota!=-1);
		if(contperfecto>0)
		{
			System.out.println("Se ha obtenido al menos un 10");
		}
		else
		{
			System.out.println("No se ha obtenido ningún 10");
		}
	}

}

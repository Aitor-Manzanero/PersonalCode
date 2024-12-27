package estructuras_repetitivas;
import java.util.Scanner;
public class media_edad {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int media=0;
		int acu=0;
		int contador=1;
		
		do
		{
			System.out.println("Introduce la edad");
			int n=sc.nextInt();
			acu+=n;
			media=acu/contador;
			contador++;
		} while(media<=25);
		
		System.out.println(media);
		
	}

}

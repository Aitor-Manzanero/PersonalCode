package estructuras_repetitivas;
public class SumaCuadrados {

	public static void main(String[] args) {
		int acum=0;
		for (int i=1;i<=5;i++)
		{
			int cuadrado=i*i;
			acum+=cuadrado;
		}
		System.out.println(acum);
	}

}

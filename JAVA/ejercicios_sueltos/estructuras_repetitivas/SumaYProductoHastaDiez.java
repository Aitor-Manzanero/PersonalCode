package estructuras_repetitivas;

public class SumaYProductoHastaDiez {
	public static void main(String[] args) {
		int sumatorio=0;
		int multiplicador=1;
		for(int i=1;i<=10;i++)
		{
			sumatorio+=i;
			multiplicador=multiplicador*i;
		}
		System.out.println(sumatorio + " " + multiplicador);
	}
}

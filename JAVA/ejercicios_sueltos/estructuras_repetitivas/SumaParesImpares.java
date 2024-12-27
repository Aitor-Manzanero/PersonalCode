package estructuras_repetitivas;

public class SumaParesImpares {

	public static void main(String[] args) {
		int sumPar=0;
		int sumImpar=0;
		for (int i=100;i<=200;i++)
		{
			if(i%2==0)
			{
				sumPar+=i;
			}
			else
			{
				sumImpar+=i;
			}
		}
		System.out.println("Los pares suman " + sumPar + " y los impares suman " + sumImpar );
	}

}

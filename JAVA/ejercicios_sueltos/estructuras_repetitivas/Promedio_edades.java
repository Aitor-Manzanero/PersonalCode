package estructuras_repetitivas;

public class Promedio_edades {

	public static void main(String[] args) {
		int min_maniana=0;
		int min_tarde=0;
		int min_noche=0;
		int max_maniana=0;
		int max_tarde=0;
		int max_noche=0;
		int acu_maniana=0;
		int acu_tarde=0;
		int acu_noche=0;
		int media_maniana=0;
		int media_tarde=0;
		int media_noche=0;
		
		for (int i=1; i<=50; i++)
		{
			int edad_temporal=(int) (Math.random()*(28-16+1)+16);
			acu_maniana+=edad_temporal;
			if (i==1)
			{
				min_maniana=edad_temporal;
				max_maniana=edad_temporal;
			}
			else
			{
				if (edad_temporal<min_maniana)
				{
					min_maniana=edad_temporal;
				}
				else if (edad_temporal>max_maniana)
				{
					max_maniana=edad_temporal;
				}
			}
				
		}
		media_maniana=acu_maniana/50;
		
		for (int i=1; i<=60; i++)
		{
			int edad_temporal=(int) (Math.random()*(35-16+1)+16);
			acu_tarde+=edad_temporal;
			if (i==1)
			{
				min_tarde=edad_temporal;
				max_tarde=edad_temporal;
			}
			else
			{
				if (edad_temporal<min_tarde)
				{
					min_tarde=edad_temporal;
				}
				else if (edad_temporal>max_tarde)
				{
					max_tarde=edad_temporal;
				}
			}
				
		}
		media_tarde=acu_tarde/60;
		
		for (int i=1; i<=110; i++)
		{
			int edad_temporal=(int) (Math.random()*(45-16+1)+16);
			acu_noche+=edad_temporal;
			if (i==1)
			{
				min_noche=edad_temporal;
				max_noche=edad_temporal;
			}
			else
			{
				if (edad_temporal<min_noche)
				{
					min_noche=edad_temporal;
				}
				else if (edad_temporal>max_noche)
				{
					max_noche=edad_temporal;
				}
			}
				
		}
		media_noche=acu_noche/110;
		
		System.out.println(min_maniana + " " + max_maniana);
		System.out.println(min_tarde + " " + max_tarde);
		System.out.println(min_noche + " " + max_noche);
		
		if (media_maniana > media_tarde & media_maniana > media_noche)
		{
			System.out.println("La media de la mañana tiene un promedio de edad superior");
		}
		
		else if (media_tarde > media_maniana & media_tarde > media_noche)
		{
			System.out.println("La media de la tarde tiene un promedio de edad superior");
		}
		
		else if (media_noche > media_maniana & media_noche > media_tarde)
		{
			System.out.println("La media de la noche tiene un promedio de edad superior");
		}
		else {
			System.out.println("El promedio es igual");
		}
	}

}

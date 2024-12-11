/*
 17 Realiza un programa que nos pida número enteros hasta que se introduzca el 0, diciéndonos, para cada número introducido si es primo o no. 
 Hay que recordar que un número es primo si es divisible por si mismo y por 1. El 1 no es primo por convenio. Se debe crear una función que 
 pasándole un número entero devuelva si es primo o no. 
 */

package funciones;
import java.util.Scanner;
	
	public class Funciones_Numeros_Primos {

		public static boolean esPrimo(int num) { 	//Función que comprueba la primalidad de un número
			 if (num==1) 							//Uno nunca es primo
		        {
		            return false;
		        }
		        
		        for (int i=2; i<=num/2; i++) {		//Bucle para comprobar si tiene algún divisor distinto de 1 y de sí mismo.
		            if (num%i==0) {
		                return false;				//Parada al encontrar un divisor.
		            }
		        }
		        return true;						//Se cumple si no es 1 ni tiene otro divisor distinto de 1 y de sí mismo.
		}
		
		 public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.println("Introduce un número entero mayor que 0 para saber si es primo o no. Introduce un 0 para terminar el programa");
				int numero=sc.nextInt();	//Nº a comprobar si es primo introducido por teclado.
				
				while (numero!=0)		//Bucle para pedir nºs. Con 0 no entra al bucle y el programa termina.
				{		
					if(numero<0)		//Descarta nºs negativos y pide otro.
					{
						System.out.println("Número introducido no válido. Introduce un entero mayor que 0, o 0 para terminar");
						numero=sc.nextInt();
					}
					else
					{
						boolean resultado=esPrimo(numero);	//Llamada a la función
						if(resultado)	//Número primo
							{
								System.out.println("El número es primo");
							}
							else		//Número no primo
							{
								System.out.println("El número no es primo");
							}
						
						System.out.println("Introduce un número entero mayor que 0 para saber si es primo o no. Introduce un 0 para terminar el programa"); //Pide otro número
						numero=sc.nextInt();
					}
				}
		}
}
		/*
		 ESTA FUE LA SEGUNDA SOLUCIÓN, AL IGUAL QUE LA PRIMERA, USE PROCEDIMIENTOS, AUNQUE PIDIERA FUNCIONES. EL PROCEDIMIENTO QUEDA MÁS LIMPIO QUE
		 EN EL PRIMER INTENTO, SIN BOOLEANOS NI BREAKS. 
		 
		public static void esPrimo(int num) { 
	        if (num==1) 
	        {
	            System.out.println("No es primo");
	            return;
	        }
	        
	        for (int i=2; i<=num/2; i++) {
	            if (num%i==0) {
	                System.out.println("No es primo");
	                return;
	            }
	        }
	        System.out.println("Es primo");
	    }

	    public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Introduce un número entero mayor que 0 para saber si es primo o no. Introduce un 0 para terminar el programa");
			int numero=sc.nextInt();
			
			while (numero!=0)
			{		
				if(numero<0)
				{
					System.out.println("Número introducido no válido");
					break;
				}
				else
				{
					esPrimo(numero);
					System.out.println("Introduce un número entero mayor que 0 para saber si es primo o no. Introduce un 0 para terminar el programa");
					numero=sc.nextInt();
				}
			}
	    }
	} 
	
	*/
	
	/*
	ESTE FUE MI PRIMER INTENTO DE SOLUCIÓN. FUNCIONA PERO NO ME CONVENCÍA LA ESTRUCTURA OBTENIDA
	 
	public static void esPrimo(int num)
	{
		boolean primo=false;
		for (int i=2; i<=num/2; i++)
		{
			if(num%i==0)
			{
				System.out.println("No es primo");
				primo=true;
				break;
			}
		}
		if (primo==false)
		{
			System.out.println("Es primo");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un número entero mayor que 0 para saber si es primo o no. Introduce un 0 para terminar el programa");
		int numero=sc.nextInt();
		
		while (numero!=0)
		{		
			if(numero<0)
			{
				System.out.println("Número introducido no válido");
				break;
			}
			else
			{
				esPrimo(numero);
				System.out.println("Introduce un número entero mayor que 0 para saber si es primo o no. Introduce un 0 para terminar el programa");
				numero=sc.nextInt();
			}
		}
		
	}

} 

		DUDAS:
		POR QUÉ EL CHATO ME DICE QUE UTILIZE WHILE (TRUE) EN EL MAIN?
		ES CORRECTO EL USO DE RETURNS EN PROCEDIMIENTOS PARA ACABAR LA EJECUCIÓN?

*/

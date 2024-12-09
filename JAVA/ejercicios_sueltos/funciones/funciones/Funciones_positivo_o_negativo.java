/*
 4- Escribe un programa que pida un número entero por teclado y muestre por pantalla si es positivo, negativo o cero. Implementa y utiliza la función:
	int dimeSigno(int a) // Devuelve -1 si es negativo, 0 si es igual a 0, 1 si es positivo
 */

package funciones;
import java.util.Scanner;
public class Funciones_positivo_o_negativo {

	public static int dimeSigno(int a) //Función para conocer si un entero es positivo o no.
	{
	int signo=0;	//Devuelve el signo. 1=positivo. -1=negativo. 0=0.
		if(a>0)
		{
			signo=1;
		}
		else if(a<0)
		{
			signo=-1;
		}
		else
		{
			signo=0;
		}
		return signo;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime un número");
		int num=sc.nextInt();		//Número a comprobar
		int signo=dimeSigno(num);	//Llamada a la función
		System.out.println(signo);
	}
}
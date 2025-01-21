/* Se trata de implementar un programa que sume los dígitos de un número entero no negativo. Por ejemplo, la suma de los dígitos del 3433 es 13.
Para darle un poco más de emoción, el programa no se limitará a escribir el resultado de la suma, sino que
también escribirá todos los sumandos utilizados: 3 + 4 + 3 + 3 = 13. */

//No lo entiendo. Buscar explicación y reescribir.

package recursividad;

import java.util.Scanner;

public class SumaDigitos {

	public static int sumaDigitos(int n)
	{
	    if (n==0)
	    {
	        
	        return n;
	    }
	    else
	    {
	        int suma = sumaDigitos(n/10);
	        if (suma == n)
	        {
	            System.out.print(n%10+"=");
	        }
	        else
	        {
	            System.out.print(n%10+"+");
	        }
	        return (n%10)+suma;
	    }

	}    
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        while (n>=0)
	        {
	            System.out.println(sumaDigitos(n));
	            n= sc.nextInt();
	        }
	    }
	    
	}
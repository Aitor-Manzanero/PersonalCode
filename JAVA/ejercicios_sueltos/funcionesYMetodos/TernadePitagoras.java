/* Realiza un programa que permita comprobar si una terna de valores enteros (3 valores) se ajusta
a la ecuación de Pitágoras: x ² + y ² = z ². El programa solicita al usuario los valores x, y, z. Se
deberá crear una función a la que se le pase x, y, z y devuelva si son iguales o no. Por ejemplo: 3
² + 4 ² = 5 ².  */

package funcionesYMetodos;

import java.util.Scanner;

public class TernadePitagoras {
	
	public static boolean pitagoras(double x, double y, double z)
	{
		if ((Math.pow(x, 2)) + (Math.pow(y, 2)) == (Math.pow(z, 2))){
				return true;
			}
		
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Intoduce el primer valor de la ecuación de pitárogas: ");
		double x = sc.nextDouble();
		System.out.println("Intoduce el segundo valor de la ecuación de pitárogas: ");
		double y = sc.nextDouble();
		System.out.println("Intoduce el tercer valor de la ecuación de pitárogas: ");
		double z = sc.nextDouble();
		
		if (pitagoras(x,y,z)){
			System.out.println("Cumple con la ecuación de Pitágoras.");
		}
		
		else {
			System.out.println("No cumple con la ecuación de Pitágoras.");
		}
	}

}

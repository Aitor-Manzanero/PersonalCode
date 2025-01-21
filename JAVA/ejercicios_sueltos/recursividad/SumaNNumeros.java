/* Realizar una función recursiva que sume los n primeros números. Recibirá como parámetro un
número entero mayor o igual a 1 y devolverá el resultado de sumar todos los números
enteros empezando por 1 y terminando por el número recibido. */

package recursividad;

import java.util.Scanner;

public class SumaNNumeros {

	public static int sumaNumeros (int num) {
		if (num > 0) {
		return num + sumaNumeros(num-1);
		}
		else {		//La profesora hizo ==1 return 1,
			return num;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número deseado");
		int num = sc.nextInt();
		System.out.println(sumaNumeros(num));
		
	}

}

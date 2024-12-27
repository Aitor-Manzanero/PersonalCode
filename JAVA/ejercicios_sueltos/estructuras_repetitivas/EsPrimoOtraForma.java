package estructuras_repetitivas;
import java.util.Scanner;
public class EsPrimoOtraForma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num, divisor, contador; 
		num=0;	//almacena dato por teclado
		divisor=1; //condición del bucle + todos los divisores posibles.
		contador=0; // Cuenta las veces que se ejecuta el if. Si solo ocurre 2 veces, primo. Si ocurre más, no primo
		System.out.println("Escribe un número");
		num=sc.nextInt();
		while(divisor<=num) {
		int temp=num%divisor; //Calcula si la división tiene de resto 0. Trigger del if de abajo
		divisor++;
			if(temp==0) {
				contador++;
			}	
		}
		if (contador<=1 || contador>2) {
		System.out.println("No es un número primo");
		}
		else {
		System.out.println("Es un número primo");
		}
		sc.close();
	}
	
}

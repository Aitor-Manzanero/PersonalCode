package repetidosMAtricesFunciones;

import java.util.Scanner;

public class FuncionDescuento {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce el precio pagado: ");
		double precioFinal = sc.nextDouble();
		System.out.println("Introduce el precio inicial: ");
		double precioInicial = sc.nextDouble();
		
		System.out.println(descuento(precioFinal, precioInicial));
		
		
	}
	
	public static double descuento (double conDescuento, double sinDescuento) {
		return ((sinDescuento-conDescuento)/sinDescuento)*100;
	}

}

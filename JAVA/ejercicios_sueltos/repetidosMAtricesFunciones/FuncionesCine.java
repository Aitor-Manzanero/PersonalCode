package repetidosMAtricesFunciones;

import java.util.Arrays;
import java.util.Scanner;

public class FuncionesCine {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		double precioN = 9;
		double precioEsp = 12.5;
		boolean[][] sala = { { false, false, false, false, false, false, false, false, false },
				{ false, false, false, false, false, false, false, false, false }, 
				{ false, false, false, false, false, false, false, false, false }, 
				{ false, false, false, false, false, false, false, false, false }, 
				{ true, false, false, true, true, false, false, false, false }, 
				{ false, false, false, false, false, true, true, false, false }, 
				{ false, false, false, false, false, false, false, false, false }, 
				{ false, false, false, false, false, false, false, false, false } };
		int filas = sala.length;
		int columnas = sala[0].length;
		double[][] precioSala = precios(precioN, precioEsp, filas, columnas);
		char opcion;
	
		do {
			opcion = menu();
			
			switch (opcion) {
			case 'M': muestraAsientos(sala);
					System.out.println();
					codigoAsiento(filas, columnas);
					System.out.println();
					muestraPrecio(precioSala);
					System.out.println();
					System.out.println("--------------------------");
					break;
					
			case 'R': reservaAsiento(sala, precioSala);
					break;
					
			case 'D': cancelaReserva (sala);				
					break;
					
			case 'C': cuentaAsiento(sala);
					break;
					
			case 'S': double caja = recaudado (sala, precioSala);	
					System.out.println("El total recaudado es de " + caja);
					break;
			
			default: System.out.println("Opción no valida.");
				
			}
		}while (opcion != 'S');
	
	}

	//Inicialización de arrays con precios
	public static double [][] precios(double precioN, double precioEsp, int filas, int columnas) {
		double[][]precioAsiento = new double[filas][columnas];
		
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				if (j == 0 | j == columnas) {
					precioAsiento[i][j] = precioEsp;
				}
				else {
					precioAsiento[i][j] = precioN;
				}
			}
		}
		
		return precioAsiento;
	}
	
	//Menú de opciones
	public static char menu() {
		System.out.println("M. Mostrar los asientos");
		System.out.println("R. Reservar asiento");
		System.out.println("D. Cancelar reserva");
		System.out.println("C. Contar asientos");
		System.out.println("S. Salir");
		char opcion = sc.nextLine().charAt(0);
		return Character.toUpperCase(opcion);
	}
	
	//Muestra si los asientos están libres u ocupados
	public static void muestraAsientos (boolean [][] sala) {
		for (int i = 0; i < sala.length; i++) {
			for (int j = 0; j < sala[i].length; j++) {
				if (sala[i][j] == true) {
					System.out.printf("%12s", "Ocupado");
				}
				else {
					System.out.printf("%12s", "Disponible");
				}
			}
		}
	}
	
	
	//Muestra el código del asiento
	public static void codigoAsiento (int fila, int columna) {
		for (int i = 0; i < fila; i++) {
			for (int j = 0; j < columna; j++) {
				System.out.print("        " + 0 + i + 0 + j);	
				
			}
		}
	}
	
	//Muestra el precio del asiento
	public static void muestraPrecio (double [][] precioSala) {
		for (int i = 0; i < precioSala.length; i++) {
			for (int j = 0; j < precioSala[i].length; j++) {
					System.out.printf("%12.2f",precioSala[i][j]);
			}
		}
	}
	
	//Reserva un asiento
	public static void reservaAsiento (boolean[][] sala, double[][] precioSala) {
		System.out.println("Introduce el código del asiento");
		int cod = sc.nextInt();
		sc.nextLine();
		int filaR = cod/100;
		int columnaR =cod%100;
		
		if (((filaR >= 0 & filaR < sala.length) & (columnaR >= 0 & columnaR < sala[0].length))){
			if (sala[filaR][columnaR] == false) {
				sala[filaR][columnaR] = true;
				System.out.println("El asiento " + 0 + filaR + 0 + columnaR + " se ha reservado con éxito");
				System.out.println("El coste del asiento es de " + precioSala[filaR][columnaR]);
			}
			else {
				System.out.println("El asiento ya está reservado");
			}
			
		}
		else {
			System.out.println("El asiento no existe");
		}
	}
	
	public static void cancelaReserva (boolean[][] sala) {
		final String pass = "Polis1DAWM";
		System.out.println("Introduce la contraseña");
		String intento = sc.nextLine();
		
		if (intento.equals(pass)) {
			System.out.println("Introduce el código del asiento");
			int cod = sc.nextInt();
			sc.nextLine();
			int filaR = cod/100;
			int columnaR =cod%100;
			
			if (((filaR >= 0 & filaR < sala.length) & (columnaR >= 0 & columnaR < sala[0].length))){
				if (sala[filaR][columnaR] == true) {
					sala[filaR][columnaR] = false;
					System.out.println("El asiento " + 0 + filaR + 0 + columnaR + " se ha cancelado con éxito");
				}
				else {
					System.out.println("El asiento ya está reservado");
				}
				
			}
		}
		
		else {
			System.out.println("Contraseña incorrecta");
		}
	}
	
	public static void cuentaAsiento (boolean[][] sala) {
		int ocupados = 0;
		int libres = 0;
		for (int i = 0; i < sala.length; i++) {
			for (int j = 0; j < sala[i].length; j++) {
				if (sala[i][j]==true) {
					ocupados++;
				}
				else {
					libres++;
				}
			}
		}
		System.out.println("Los asientos ocupados son: " + ocupados);
		System.out.println("Los asientos libres son: " + libres);
	}
	
	public static double recaudado (boolean[][] sala, double[][] precioSala) {
		double cajaTotal = 0;
		
		for (int i = 0; i < sala.length; i++) {
			for (int j = 0; j < sala[i].length; j++) {
				if (sala[i][j] == true) {
					cajaTotal += precioSala[i][j];
				}
			}
		}
		return cajaTotal;
	}
	
}

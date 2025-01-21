package repasoEvaluacionDos;


import java.util.Scanner;

public class EntradasCine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int filas = 8; //Si se quisiera cambiar, se podría pedir al trabajador que ponga el nº de filas y columnas por teclado.
		int columnas = 9;
		double [][] precioAsiento = precioAsiento (filas, columnas);	//Retorno de los precios
		boolean [][] ocupado = asientoOcupado (); //retorno de estado de los asientos
		char opcion;	//Selección del menú
		
		
		
		do {
			opcion = menuCine();
			
			switch (opcion) {
			case 'M': System.out.print("Código: ");
					
					for (int i = 0; i < precioAsiento.length; i++) {		//Muestra el código
						for (int j = 0; j < precioAsiento.length; j++) {
							System.out.print((i+ "" + j) + "    ");
						}
					}
					System.out.println();
					
					System.out.print("Precio: ");				// Muestra el precio
					for (int i = 0; i < precioAsiento.length; i++) {
						for (int j = 0; j < precioAsiento.length; j++) {
							System.out.print(precioAsiento[i][j] + "   ");
						}
					}
					System.out.println();
					
					System.out.print("Estado: ");		//Muestra el estado
					for (int i = 0; i < precioAsiento.length; i++) {
						for (int j = 0; j < precioAsiento.length; j++) {
							if (ocupado[i][j]==true) {
							System.out.print("reser" + " ");
							}
							else {
								System.out.print("Libre" + " ");
							}
						}
					}
					break;
					
			case 'R': reserva(ocupado, precioAsiento);
					break;
					
			case 'D': cancelacion(ocupado);
					break;
					
			case 'C': cuentaAsientos(ocupado); 		
					break;
			
			case 'S': double recaudado = recaudado(ocupado, precioAsiento);	//Guarda lo acumulado en entradas
					System.out.println(recaudado);	
					break;
				
			default: System.out.println("Opción no valida.");
				
			}
		}while (opcion != 'S');
		
		
	}
	
	public static char menuCine () {
		Scanner sc = new Scanner(System.in);
		System.out.println("Gestor de cine. Marca una opción para continuar");
		System.out.println("M. Mostrar los asientos.");
		System.out.println("R. Reservar asiento");
		System.out.println("D. Cancelar reserva");
		System.out.println("C. Contar asientos");
		System.out.println("S. Salir");
		char opcion = sc.nextLine().charAt(0); //Selecciona opción del menú
		opcion = Character.toUpperCase(opcion);
		return opcion;
	}
	
	public static double [][] precioAsiento(int filas, int columnas) {			// Matriz con precio de cada asiento
		double [][] precioAsiento = new double [filas][columnas];
		
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				if (j == 0 | j == columnas-1) {
					precioAsiento[i][j] = 12.5;
				}
				else {
					precioAsiento[i][j] = 9;
				}
			}
		}
		
		return precioAsiento;
	}
	
	public static boolean [][] asientoOcupado () {		//Esta forma de declarar hace que ya solo funcione para 8x9
		boolean [][] ocupado =
			{ { false, false, false, false, false, false, false, false, false },
			{ false, false, false, false, false, false, false, false, false }, 
			{ false, false, false, false, false, false, false, false, false }, 
			{ false, false, false, false, false, false, false, false, false }, 
			{ true, false, false, true, true, false, false, false, false }, 
			{ false, false, false, false, false, true, true, false, false }, 
			{ false, false, false, false, false, false, false, false, false }, 
			{ false, false, false, false, false, false, false, false, false } };
		
		
		return ocupado;
	}
	
	public static void reserva ( boolean [][]ocupado, double [][]precioAsiento) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el código del asiento.");
		int codigo = sc.nextInt();
		sc.nextLine(); //Limpiar buffer
		int fila = codigo/100;	//El código está formado por un 0 y el nº de fila + otro 0 y el nº columna. Con fila se extrae la fila y con columna la columna.
		int columna = codigo%100;
		
		if (ocupado[fila][columna] == true | fila > ocupado.length | fila < 0 | columna > ocupado[0].length | columna < 0) {
			System.out.println("La butaca seleccionada está ocupada o no existe.");	
		}
		else {
			System.out.println(precioAsiento[fila][columna]);
			ocupado[fila][columna] = true;
		}
	}
	
	public static double recaudado (boolean[][]ocupado, double [][] precioAsiento) {
		double recaudado = 0;
		
		for (int i = 0; i < ocupado.length; i++) {
			for (int j = 0; j < ocupado[i].length; j++) {
				if (ocupado[i][j]== true & (j == 0 | j == ocupado.length) ) {		//Esta parte está mal, no es necesario el if y el else if.
					recaudado += precioAsiento[i][j];
				}
				else if (ocupado[i][j]== true & (j != 0 & j != ocupado.length)) {
					recaudado += precioAsiento[i][j];
				}
			}
		}
		
		return recaudado;
	}
	
	public static void cuentaAsientos (boolean [][] ocupado) {
		int ocupados = 0;
		int libres = 0;
		
		for (int i = 0; i < ocupado.length; i++) {
			for (int j = 0; j < ocupado[i].length; j++) {
				if (ocupado[i][j]== true) {
					ocupados++;
				}
				else {
					libres++;
				}
			}
		}
		
		System.out.println("El total de asientos libres es de " + libres);
		System.out.println("El total de asientos ocupados es de " + ocupados);
	}
	
	public static void cancelacion (boolean[][] ocupado)
	{
		final String pass = "Polis1DAWM";
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la contraseña");
		String intento = sc.nextLine();
		
		if (intento.equals(pass)) {  //Cuidado con no utilizar equals y simplemente poner intento == pass
			System.out.println("Introduce el código de butaca");
			int codigo = sc.nextInt();
			sc.nextLine(); //Limpiar buffer
			int fila = codigo/100;	//El código está formado por un 0 y el nº de fila + otro 0 y el nº columna. Con fila se extrae la fila y con columna la columna.
			int columna = codigo%100;
			ocupado[fila][columna] = false;
			}
		else {
			System.out.println("Contraseña no valida");
		}
	
	}


}

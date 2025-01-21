package repetidosMAtricesFunciones;

public class MatrizHojaCalculo {

	public static void main(String[] args) {
		int [][] matriz = new int[4][5];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int) (Math.random()*(1000-100)+100);
			}
		}
		
		int sumaFila;
		
		for (int i = 0; i < matriz.length; i++) {
			sumaFila = 0;
			for (int j = 0; j < matriz[i].length; j++) {	
				System.out.printf("%7d ", matriz[i][j]);
				sumaFila += matriz[i][j];
			}
			System.out.printf("|%7d\n", sumaFila);
		}
		
		for (int i = 0; i <matriz.length; i++) {
			System.out.printf("----------");
		}
		
		System.out.printf("----------");
		int sumaColumna;
		int sumaTotal = 0;
		for (int i = 0; i < matriz.length; i++) {
			sumaColumna = 0;
			for (int j = 0; j < matriz[i].length; j++) {
				sumaColumna += matriz[i][j];
			}
			sumaTotal += sumaColumna;
			System.out.printf("%7d ", sumaColumna);
		}
		System.out.printf("|%7d", sumaTotal);
	}
	
}

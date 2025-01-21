package repetidosMAtricesFunciones;

public class Matriz1al25 {

	public static void main(String[] args) {
		int [][] numerosNaturales = new int [5][5];
		int contador = 1;
		
		for (int i = 0; i < numerosNaturales.length; i++) {
			for (int j = 0; j < numerosNaturales[i].length; j++) {
				numerosNaturales[i][j] = contador;
				System.out.print(numerosNaturales[i][j] + " ");
				contador++;
			}
		}
		
		
	}

}

package repetidosMAtricesFunciones;

public class MatrizFilaMasLarga {

	public static void main(String[] args) {
		int [][] matriz = {{43,1},{67,3,1,8,6,8},{2,7,9,2,1},{1,6,8},{4,7}};
		int filaActual = 0;
		int filaLarga = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[i].length; j++) {
				filaActual++;
				
			}
			
			if (i == 0) {
				filaLarga = filaActual;	
			}
			else if (filaActual > filaLarga) {
				filaLarga = filaActual;
			}
			filaActual = 0;
		}
		
		System.out.println("La fila más larga tiene un tamaño de : " + filaLarga);
	}

}

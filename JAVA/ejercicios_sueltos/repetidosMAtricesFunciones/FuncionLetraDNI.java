package repetidosMAtricesFunciones;

public class FuncionLetraDNI {

	public static void main(String[] args) {
		int dni = 56321122;
		letraDNI(dni);
		
	}
	
	public static void letraDNI (int dni) {
		final String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		char letra = letras.charAt(dni%23);
		System.out.println(letra);
		
	}

}

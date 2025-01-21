/* 	El NIF (o letra asociada a un DNI) se obtiene de la siguiente manera: Se divide el número de DNI entre 23 y el resto es codificado 
por una letra según la siguiente equivalencia:0: "T", 1: "R", 2: "W", 3: "A", 4: "G", 5: "M", 6: "Y", 7: "F", 8: "P", 9: "D",10:"X", 11: "B", 
12: "N", 13: "J", 14: "Z", 15: "S", 16: "Q", 17: "V", 18: "H", 19: "L", 20: "C", 21: "K", 22: "E". Escribe un programa que pida el DNI 
y muestre por pantalla la letra asociada. Para ello se deberá crear una función a la que se le pase el número y devuelva la letra.
Ejemplo: para el DNI 56321122 el NIF es ‘X’. */

package funcionesYMetodos;

public class FuncionDNI {

	public static char letraDNI (int numero) {
		int resto = numero % 23;
		String letrasPosibles = "TRWAGMYFPDXBNJZSQVHLCKE";
		return letrasPosibles.charAt(resto);
	}
	
	public static void main(String[] args) {
		int numDNI = 56321122;
		System.out.println(letraDNI (numDNI));
		
	}

}

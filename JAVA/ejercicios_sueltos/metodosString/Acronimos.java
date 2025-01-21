/*Crea un programa que pida por teclado tres cadenas de texto: nombre y dos apellidos. Luego
mostrará un código de usuario (en mayúsculas) formado por la concatenación de las tres
primeras letras de cada uno de ellos. Por ejemplo si se introduce “Lionel”, “Tarazón” y
“Alcocer” mostrará “LIOTARALC”.*/

package metodosString;
import java.util.Scanner;
public class Acronimos {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce la primera palabra");
		String palabra1=sc.nextLine();
		System.out.println("Introduce la segunda palabra");
		String palabra2=sc.nextLine();
		System.out.println("Introduce la tercera palabra");
		String palabra3=sc.nextLine();
		String acronimo=palabra1.substring(0,3) + palabra2.substring(0,3) + palabra3.substring(0,3);
		System.out.println(acronimo.toUpperCase());
	}

}

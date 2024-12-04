package ejercicios_sueltos;

public class variable_auxiliar {

	public static void main(String[] args) {
		int num1, num2, numAux;
		num1=2;
		num2=3;
		System.out.println(num1 + " " + num2);
		numAux=num1;
		num1=num2;
		num2=numAux;
		System.out.println(num1 + " " +num2);
	}

}

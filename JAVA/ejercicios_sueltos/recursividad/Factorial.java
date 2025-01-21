/* El factorial de un número n se calcula multiplicando todos los números enteros entre el 1 y n.
Así el factorial de 5 será 5x4x3x2x1 o, lo que es lo mismo, el factorial(5) será 5 * factorial(4)
Como caso especial tenemos el factorial(0) que vale 1.
Implementa una función recursiva que calcule el factorial de un número.
Definición de la función:
public static int factorial(int numero)
Utilízala en un programa que vaya pidiendo números al usuario y calcule su factorial. El
programa terminará al recibir un número negativo. */

package recursividad;

import java.util.Scanner;

public class Factorial {

	public static int factorial (int numero) {
		if (numero == 0)
		{
			return 1;
		}
		else
		{
			return numero * factorial (numero-1);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int numero = 0;
		do {
			System.out.println("Introduce un número entero para calcular su factorial. Introduzca uno negativo para acabar con la ejecución.");
			numero = sc.nextInt();
			if (numero < 0) {
				System.out.println("Hasta otra");
			}
			else {
				System.out.println(factorial (numero));
			}
		} while (numero >= 0);
	}

}






/* Esto no tiene nada que ver: es un ejemplo de ejecución para el examen:
*********************************************************

Bienvenid@ al sistema de reservas de Cinépolis DAWM. Selecciona una opción:

M. Mostrar asientos

R. Reservar entrada

D. Cancelar reserva

C. Contar asientos

S. Salir

*********************************************************

m

 Código Estado Precio
 ______________________________

 S00 Libre 12,50 €

 S01 Libre 9,00 €

 S02 Libre 9,00 €

 S03 Libre 9,00 €

 S04 Libre 9,00 €

 S05 Libre 9,00 €

 S06 Libre 9,00 €

 S07 Libre 9,00 €

 S08 Libre 12,50 €

 S10 Libre 12,50 €

 S11 Libre 9,00 €

 S12 Libre 9,00 €

 S13 Libre 9,00 €

 S14 Libre 9,00 €

 S15 Libre 9,00 €

 S16 Libre 9,00 €

 S17 Libre 9,00 €

 S18 Libre 12,50 €

 S20 Libre 12,50 €

 S21 Libre 9,00 €

 S22 Libre 9,00 €

 S23 Libre 9,00 €

 S24 Libre 9,00 €

 S25 Libre 9,00 €

 S26 Libre 9,00 €

 S27 Libre 9,00 €

 S28 Libre 12,50 €

 S30 Libre 12,50 €

 S31 Libre 9,00 €

 S32 Libre 9,00 €

 S33 Libre 9,00 €

 S34 Libre 9,00 €

 S35 Libre 9,00 €

 S36 Libre 9,00 €

 S37 Libre 9,00 €

 S38 Libre 12,50 €

 S40 Ocupado 12,50 €

 S41 Libre 9,00 €

 S42 Libre 9,00 €

 S43 Libre 9,00 €

 S44 Ocupado 9,00 €

 S45 Ocupado 9,00 €

 S46 Libre 9,00 €

 S47 Libre 9,00 €

 S48 Libre 12,50 €

 S50 Libre 12,50 €

 S51 Libre 9,00 €

 S52 Libre 9,00 €

 S53 Libre 9,00 €

 S54 Libre 9,00 €

 S55 Libre 9,00 €

 S56 Ocupado 9,00 €

 S57 Ocupado 9,00 €

 S58 Libre 12,50 €

 S60 Libre 12,50 €

 S61 Libre 9,00 €

 S62 Libre 9,00 €

 S63 Libre 9,00 €

 S64 Libre 9,00 €

 S65 Libre 9,00 €

 S66 Libre 9,00 €

 S67 Libre 9,00 €

 S68 Libre 12,50 €

 S70 Libre 12,50 €

 S71 Libre 9,00 €

 S72 Libre 9,00 €

 S73 Libre 9,00 €

 S74 Libre 9,00 €

 S75 Libre 9,00 €

 S76 Libre 9,00 €

 S77 Libre 9,00 €

 S78 Libre 12,50 €

*********************************************************

Bienvenid@ al sistema de reservas de Cinépolis DAWM. Selecciona una opción:

M. Mostrar asientos

R. Reservar entrada

D. Cancelar reserva

C. Contar asientos

S. Salir

*********************************************************

r

Introduce el código del asiento

s78

Reserva realizada por 12.5 €

*********************************************************

Bienvenid@ al sistema de reservas de Cinépolis DAWM. Selecciona una opción:

M. Mostrar asientos

R. Reservar entrada

D. Cancelar reserva

C. Contar asientos

S. Salir

*********************************************************

c

Hay un total de 6 asientos ocupados y 66 asientos libres

*********************************************************

Bienvenid@ al sistema de reservas de Cinépolis DAWM. Selecciona una opción:

M. Mostrar asientos

R. Reservar entrada

D. Cancelar reserva

C. Contar asientos

S. Salir

*********************************************************

d

Introduce la clave: 

Polis1DAWM

Introduce el código del asiento

s57

Reserva cancelada: -9.0€

*********************************************************

Bienvenid@ al sistema de reservas de Cinépolis DAWM. Selecciona una opción:

M. Mostrar asientos

R. Reservar entrada

D. Cancelar reserva

C. Contar asientos

S. Salir

*********************************************************

c

Hay un total de 5 asientos ocupados y 67 asientos libres

*********************************************************

Bienvenid@ al sistema de reservas de Cinépolis DAWM. Selecciona una opción:

M. Mostrar asientos

R. Reservar entrada

D. Cancelar reserva

C. Contar asientos

S. Salir

*********************************************************

s

Se han recaudado 12.5€

Hay un total de 5 asientos ocupados y 67 asientos libres */
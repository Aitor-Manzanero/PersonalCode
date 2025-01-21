/* En un solo programa: 1- Crear un array1 unidimensional de enteros de longitud 10 y rellenarlo con los números que van del 100 en adelante.
2- Crear un array2 unidimensional de enteros de longitud 20 y rellenarlo con los números que van del 20 hacia atrás.
3.- Crea un array3 unidimensional de longitud 30 rellenarlo con los 20 elementos del array2 seguidos de los 10 elementos del array1.
4.- Busca la posición en la que se encuentra el número 5 en el array3
5.- Rellena en el array2 desde la posición 5 a la posición 8 con el numero 99
6.- Copia en el array1 desde la posición 2, los 6 primeros elementos del array2﻿
7.- Mostrar los valores de los tres arrays. */

package array;

public class ArrayIntroductorio {

	public static void main(String[] args) {
		int [] array1=new int[10];
		
		for (int i=0; i<array1.length; i++)
		{
			array1[i]=i+100;
			System.out.print(array1[i] + " ");
		}
		
		System.out.println();
		int [] array2= new int[20];
		
		for (int i=0; i<array2.length; i++)
		{
			array2[i]=20-i;
			System.out.print(array2[i] + " ");
		}
		
		System.out.println();
		int [] array3=new int [30];
		
		for (int i=0; i<array3.length; i++)
		{
			if (i<20)
			{
				array3[i]=array2[i];
				System.out.print(array3[i] + " ");
			}
			else
			{
				array3[i]=array1[i-20];
				System.out.print(array3[i] + " ");
			}
		}
		
		System.out.println();
		for (int i=0; i<array3.length; i++)
		{
			if (array3[i]==5)
			{
				System.out.println(i); //Si el usuario entiende que la posición inicial es 1 y no 0, se imprimiría i+1.
			}
		}
		
		System.out.println();
		
		for (int i=0; i<array2.length; i++)
		{
			if (i>=5 & i<=8)
			{
				array2[i]=99;
			}
			System.out.print(array2[i] + " ");
		}
		
		System.out.println();
		int cont=0;
		
		for (int i=0;i<array1.length;i++)
		{
			if (i>=2 & i<=7)
			{
				array1[i]=array2[cont];
				cont++;
				System.out.print(array1[i] + " ");
			}
		}
		
		System.out.println();
				
		for (int i=0;i<array1.length;i++)
		{
			System.out.print(array1[i] + " ");
		}
		
		System.out.println();
		
		for (int i=0;i<array2.length;i++)
		{
			System.out.print(array2[i] + " ");
		}
		
		System.out.println();
		
		for (int i=0;i<array3.length;i++)
		{
			System.out.print(array3[i] + " ");
		}
	}

}

/*
 15 Escribe un programa que cree un array de tamaño 100 con los primeros 100 números naturales. Luego muestra la suma total y la media. 
 Implementa una función que calcule la suma de un array y otra que calcule la media de un array.
 */

 package funciones;

 public class Funciones_Suma_Media {
 
     public static int suma(int[] naturales)
     {
         int acumulador=0;		//Suma todos los valores del array
         
         for (int i=0;i<naturales.length;i++)	//Suma cada valor del array
         {
             acumulador+=naturales[i];
         }
         
         return acumulador;
     }
     
     public static double media(int acumulador, int[] naturales)
     {
         return(double) acumulador/naturales.length;	//Calcula la media
     }
     
     public static void main(String[] args) {
         int[]naturales=new int[100];		//Array números naturales
         
         for (int i=0;i<naturales.length;i++)	//Rellena del 1 al 101
         {
             naturales[i]=i+1;
         }
         
         int suma=suma(naturales);
         double media=media(suma, naturales);
         System.out.println("La suma es " + suma + " y la media es " + media);
     }
 
 }
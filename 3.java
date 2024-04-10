/******************************************************************************

3. Realice un programa que pida el tamaño del array por teclado, posteriormente guarde números correspondiente 
al tamaño del array y finalmente mostrar en pantalla cual es el mayor de todos y si hubo empate mostrar cuantas veces se repitió.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int n = 1, tamano, mayor = -1, empate=0;
		int numeros[];
		Scanner leer = new Scanner(System.in);
		
		System.out.print("Ingrese tamanio del array: ");
		tamano = leer.nextInt();
		
		numeros = new int[tamano];
		
		while(n <= tamano){
		    System.out.print("Ingrese digito #" + n + ": ");
		    numeros[n-1] = leer.nextInt();
		    n++;
		}
		n=0; //reseteamos la variable n
		//Para saber que numero es mayor
		while(n < tamano){
		    if(n == 0) mayor = numeros[n];
		    else if(numeros[n] > numeros[n-1]) mayor = numeros[n]; //Si el numero actual es mayor del numero anterior el mayor es el actual
		    n++;
		}
		//Para saber si hay duplicados
		for(int i=0;i<numeros.length;i++){
              if(mayor == numeros[i]){
                empate++;
              }
        }
		
		if(mayor != -1) System.out.println("\n\nEl numero mayor del array es: " + mayor);
		if(empate != 0) System.out.println("Y se repitio: "+ empate + " veces.");
}
}

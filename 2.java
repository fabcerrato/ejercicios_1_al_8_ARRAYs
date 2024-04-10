/******************************************************************************

2. Realice un programa que lea 10 números por pantalla, los almacene en un array y que muestre por pantalla la sumatoria, 
resta, división y multiplicación de todos los números.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int n = 1, sumatoria=0, resta=0, multiplicacion=1, division=1;
		int numeros[] = new int[10];
		Scanner leer = new Scanner(System.in);
		
		while(n <= 10){
		    System.out.print("Ingrese el numero " + n + ": ");
		    numeros[n-1] = leer.nextInt();
		    n++;
		}
		n=0; //reseteamos la variable n
		
		while(n < 10){
		    sumatoria = sumatoria + numeros[n];
		    resta = resta - numeros[n];
		    multiplicacion = multiplicacion * numeros[n];
		    division = division / numeros[n];
		    n++;
		}
		System.out.println("\nLa sumatoria de los numeros ingresados es: " + sumatoria);
		System.out.println("\nLa resta de los numeros ingresados es: " + resta);
		System.out.println("\nLa multiplicacion de los numeros ingresados es: " + multiplicacion);
		System.out.println("\nLa division de los numeros ingresados es: " + division);
	}
}

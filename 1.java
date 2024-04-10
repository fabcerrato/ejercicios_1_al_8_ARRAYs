/******************************************************************************

1. Realice un programa que lea por teclado cinco nombres de personas y los almacene en un array y 
posteriormente mostrarlos por pantalla.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int n = 1;
		String nombres[] = new String[5];
		Scanner leer = new Scanner(System.in);
		
		while(n <= 5){
		    System.out.println("Ingrese el nombre #" + n);
		    nombres[n-1] = leer.nextLine();
		    n++;
		}
		n=0; //reseteamos la variable n
		System.out.println("\nLos nombres ingresados son:");
		while(n < 5){
		    System.out.println(nombres[n]);
		    n++;
		}
	}
}

import java.util.Scanner;

public class Potencias{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int numero, cuadrado, cubo, cuarta, quinta;

		System.out.print("Ingrese un numero entre 1 y 25: ");
		numero = in.nextInt();

		if (numero>=1 && numero<=25){
			cuadrado = numero * numero;
			cubo = numero * numero * numero;
			cuarta = numero * numero * numero * numero;
			quinta = numero * numero * numero * numero * numero;

			System.out.println("El numero es: " + numero);
			System.out.println("El cuadrado es: " + cuadrado);
			System.out.println("El cubo es: " + cubo);
			System.out.println("La cuarta es: " + cuarta);
			System.out.println("La quinta es: " + quinta); 
			} else {
			System.out.println("Te saliste del rango"); 
		}
	}
}




/*Al cuadrado
al cubo
a la cuarta
a la quinta
*/

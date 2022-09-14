import java.util.Scanner;
public class Juliancito{
	//Solicita un numero y mostrar el numero. Doble, triple, cuatruple, quintuple
	public static void main(String[] args) {
		int numero;
		Scanner in = new Scanner(System.in);

		System.out.print("Ingresa un numero: ");
		numero = in.nextInt();

		int shownum = numero;
		int doble = numero * 2;
		int triple = numero * 3;
		int cuatro = numero * 4;
		int quinto = numero * 5;
			System.out.println("El numero es: " + numero);
			System.out.println("El doble es: " + doble);
			System.out.println("El triple es: " + triple);
			System.out.println("El cuatruple es: " + cuatro);
			System.out.println("El quintuple es: " + quinto);
		}
	}

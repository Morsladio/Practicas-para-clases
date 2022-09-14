//Programa que junta 10 numeros y los suma
import java.util.Scanner;

public class sumadediez{
	public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);

	int n1, n2, n3, n4, n5, n6, n7, n8, n9, n10;
	int r;

	System.out.print("Ingrese el primer numero: ");
	n1 = in.nextInt();	

	System.out.print("Ingrese el segundo numero: ");
	n2 = in.nextInt();	
	
	System.out.print("Ingrese el tercer numero: ");
	n3 = in.nextInt();	

	System.out.print("Ingrese el cuarto numero: ");
	n4 = in.nextInt();	

	System.out.print("Ingrese el quinto numero: ");
	n5 = in.nextInt();	

	System.out.print("Ingrese el sexto numero: ");
	n6 = in.nextInt();	

	System.out.print("Ingrese el septimo numero: ");
	n7 = in.nextInt();	

	System.out.print("Ingrese el octavo numero: ");
	n8 = in.nextInt();	

	System.out.print("Ingrese el noveno numero: ");
	n9 = in.nextInt();		
	
	System.out.print("Ingrese el decimo numero: ");
	n10 = in.nextInt();	

	r = n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10;

	System.out.println("El resultado es: " + r);
}
}

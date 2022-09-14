import java.util.Scanner;

public class nummay {
	
	public static void main(String[]args){
	Scanner in = new Scanner(System.in);
	/*Solicitar 3 numeros y mostrar el numero
	 * mayor y menor*/
	 
	int num_uno, num_dos, num_tres;
	
	System.out.print("Ingrese el primer numero: ");
	num_uno = in.nextInt();
	
	System.out.print("Ingrese el segundo numero: ");
	num_dos = in.nextInt();

	System.out.print("Ingrese el tercer numero: ");
	num_tres = in.nextInt();

	if(num_uno <= num_dos && num_uno < num_tres){
		System.out.println("El Numero menor es: " + num_uno);
		} else if(num_dos <= num_uno && num_dos < num_tres){
		System.out.println("El Numero menor es: " + num_dos);
		} else if(num_tres <= num_dos && num_tres < num_uno){
		System.out.println("El Numero menor es: " + num_tres);
		}

		if (num_uno > num_dos && num_uno > num_dos) {
		System.out.println("El Numero mayor es: " + num_uno);
		}else if (num_dos > num_uno && num_dos > num_tres) {
		System.out.println("El Numero mayor es: " + num_dos);
		}else  if (num_tres > num_dos && num_tres > num_uno) {
		System.out.println("El Numero mayor es: " + num_tres);
		}
	}
}
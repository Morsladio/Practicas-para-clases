import java.util.Scanner;
import java.util.Random;

public class Matematicas{

	Scanner in = new Scanner(System.in);
	Random rnum = new Random();

	public void abs(double num1){

		System.out.print("Dame el numero: ");
		num1 = in.nextDouble();
		
		System.out.println("El abs es: " + Math.abs(num1));
	}
	public void ceil(double num1){

		System.out.print("Dame el numero: ");
		num1 = in.nextDouble();
		
		System.out.println("El ceil es: " + Math.ceil(num1));
	}
	public void cos(double num1){

		System.out.print("Dame el numero: ");
		num1 = in.nextDouble();
		
		System.out.println("El Cos es: " + Math.cos(num1));
	}
	public void maximo(double num1, double num2){

		System.out.print("Dame el primer numero: ");
		num1 = in.nextDouble();
		System.out.print("Dame el segundo numero: ");
		num2 = in.nextDouble();
		System.out.println("El numero mayor es: " + Math.max(num1, num2));
	}
	public void minimo(double num1, double num2){

		System.out.print("Dame el primer numero: ");
		num1 = in.nextDouble();
		System.out.print("Dame el segundo numero: ");
		num2 = in.nextDouble();
		System.out.println("El numero menor es: " + Math.min(num1, num2));
	}
	public void pow(double num1, double num2){

		System.out.print("Dame el primer numero: ");
		num1 = in.nextDouble();
		System.out.print("Dame el segundo numero: ");
		num2 = in.nextDouble();
		System.out.println("El numero pow es: " + Math.pow(num1, num2));
	}
	public void exp(double num1){

		System.out.print("Dame el numero: ");
		num1 = in.nextDouble();
		
		System.out.println("El exp es: " + Math.exp(num1));
	}
	public void floor(double num1){

		System.out.print("Dame el numero: ");
		num1 = in.nextDouble();
		
		System.out.println("El floor es: " + Math.floor(num1));
	}
	public void log(double num1){

		System.out.print("Dame el numero: ");
		num1 = in.nextDouble();
		
		System.out.println("El log es: " + Math.log(num1));
	}
	public void sin(double num1){

		System.out.print("Dame el numero: ");
		num1 = in.nextDouble();
		
		System.out.println("El sin es: " + Math.sin(num1));
	}
	public void sqrt(double num1){

		System.out.print("Dame el numero: ");
		num1 = in.nextDouble();
		
		System.out.println("El sqrt es: " + Math.sqrt(num1));
	}
	public void tan(double num1){

		System.out.print("Dame el numero: ");
		num1 = in.nextDouble();
		
		System.out.println("El tan es: " + Math.tan(num1));
	}
}
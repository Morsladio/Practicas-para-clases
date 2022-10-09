import java.util.Scanner;

public class a extends Matematicas{
	public static void main(String[] args) {
		Matematicas lean = new Matematicas();
			Double numero1 = 0.0; 
			Double numero2 = 0.0;

			Scanner b = new Scanner(System.in);
			System.out.println("1.-Abs");
			System.out.println("2.-Ceil");
			System.out.println("3.-Cos");
			System.out.println("4.-Maximo");
			System.out.println("5.-Minimo");
			System.out.println("6.-Pow");
			System.out.println("7.-exp");
			System.out.println("8.-floor");
			System.out.println("9.-log");
			System.out.println("10.-sin");
			System.out.println("11.-sqrt");
			System.out.println("12.-tan");
			System.out.print("Que quieres hacer: ");
			int op = b.nextInt();

			switch(op){
				case 1:
					lean.abs(numero1);
				break;
				case 2: 
					lean.ceil(numero1);
				break;
				case 3: 
					lean.cos(numero1);
				break;
				case 4:
					lean.maximo(numero1, numero2);
				break;
				case 5: 
					lean.minimo(numero1, numero2);
				break;
				case 6: 
					lean.pow(numero1, numero2);
				break;
				case 7:
					lean.exp(numero1);
				break;
				case 8: 
					lean.floor(numero1);
				break;
				case 9: 
					lean.log(numero1);
				break;
				case 10:
					lean.sin(numero1);
				break;
				case 11: 
					lean.sqrt(numero1);
				break;
				case 12: 
					lean.tan(numero1);
				break;
			}
		}	
}
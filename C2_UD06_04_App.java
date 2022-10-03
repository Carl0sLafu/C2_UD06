import java.util.Scanner;

public class C2_UD06_04_App {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Introduce un número para calcular el factorial: ");
		int number = keyboard.nextInt();
		
		keyboard.close();
		
		System.out.println(CalcularFactorial(number));

	}

	private static int CalcularFactorial(int number) {

		int resultado = 1;
		
		for (int i = number; i > 1; i--) {
			
			resultado *= i;
			
		}
		
		return resultado;
	}

}

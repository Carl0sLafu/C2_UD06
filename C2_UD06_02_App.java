import java.util.Scanner;

public class C2_UD06_02_App {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Cantidad de numeros a generar: ");
		int length = keyboard.nextInt();
		
		int num1 = 0;
		int num2 = 0;
		
		System.out.print("Introduce un número: ");
		num1 = keyboard.nextInt();
		
		System.out.print("Introduce otro número: ");
		num2 = keyboard.nextInt();
		
		keyboard.close();
		
		if (num1 > num2) {
			
			int temporalSave = num1;
			num1 = num2;
			num2 = temporalSave;
			
		}
		
		for (int i = 0; i < length; i++) {
			
			int randomLenght = RandomNumGenerator(num1, num2);
			System.out.println(randomLenght);
			
		}
		
	}

	private static int RandomNumGenerator(int num1, int num2) {
		
		return (int)Math.floor(Math.random() * (num2 - num1 + 1) + num1);
		
	}

}

import java.util.Scanner;

public class C2_UD06_09_App {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Tamaño del array: ");
		int length = keyboard.nextInt();
		
		keyboard.close();
		
		int arrayNumbers[] = new int[length];
		
		RellenarArrayRandom(arrayNumbers);
		
		MostrarArrayYSuma(arrayNumbers);

	}

	private static void RellenarArrayRandom(int[] arrayNumbers) {
		
		for (int i = 0; i < arrayNumbers.length; i++) {
			
			arrayNumbers[i] = (int)Math.floor(Math.random() * (10));
			
		}
		
	}
	
	private static void MostrarArrayYSuma(int[] arrayNumbers) {
		
		int suma = 0;
		
		for (int i = 0; i < arrayNumbers.length; i++) {
			
			System.out.println(arrayNumbers[i]);
			
			suma += arrayNumbers[i];
			
		}
		
		System.out.println("Suma total del array: " + suma);
		
	}

}

import java.util.Scanner;

public class C2_UD06_08_App {

	private static final Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		
		int numbers[] = new int[10];
		
		RellenarArray(numbers);
		
		MostrarArray(numbers);

	}

	private static void RellenarArray(int[] numbers) {
		
		for (int i = 0; i < numbers.length; i++) {
			
			System.out.print("Número " + (i+1) + ": ");
			numbers[i] = keyboard.nextInt();
			
		}
		
	}
	
	private static void MostrarArray(int[] numbers) {
		
		for (int i = 0; i < numbers.length; i++) {
			
			System.out.println(numbers[i]);
			
		}
		
	}

}

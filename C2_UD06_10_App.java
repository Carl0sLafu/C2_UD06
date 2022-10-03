import java.util.Scanner;

public class C2_UD06_10_App {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Tamaño del array: ");
		int length = keyboard.nextInt();
		
		int arrayNumbers[] = new int[length];
		
		System.out.print("Introduce dos números como rango: ");
		int num1 = keyboard.nextInt();
		int num2 = keyboard.nextInt();
		
		keyboard.close();
		
		RellenarArrayAleatorio(arrayNumbers, num1, num2);
		
		MostrarArray(arrayNumbers);

	}

	

	private static void RellenarArrayAleatorio(int[] arrayNumbers, int num1, int num2) {
		
		if (num1 > num2) {
			
			int temporalSave = num1;
			num1 = num2;
			num2 = temporalSave;
			
		}
		
		if (!ComprobacionRango(num1, num2)) {
			
			System.out.println("El rango introducido no tiene ningun numero primo");
			System.exit(0);
			
		}
		
		for (int i = 0; i < arrayNumbers.length; i++) {
			
			int numRandom = (int)Math.floor(Math.random() * (num2 - num1 + 1) + num1);
			
			while (!ComprobacionDeNumeroPrimo(numRandom)) {
				
				numRandom = (int)Math.floor(Math.random() * (num2 - num1 + 1) + num1);
				
			}
			
			arrayNumbers[i] = numRandom;
			
		}
		
	}

	private static boolean ComprobacionRango(int num1, int num2) {
		
		for (int i = num1; i <= num2; i++) {
			
			if (ComprobacionDeNumeroPrimo(i)) {
				
				return true;
				
			}
			
		}
		
		return false;
		
	}

	private static boolean ComprobacionDeNumeroPrimo(int number) {
		
		if (number == 0 || number == 1 || number == 4) {
			
			return false;
    
		}

		for (int x = 2; x < number / 2; x++) {

			if (number % x == 0) {
				
		    	return false;
		    	
			}
 
		}
		
		return true;
		
	}
	
	private static void MostrarArray(int[] arrayNumbers) {
		
		for (int i = 0; i < arrayNumbers.length; i++) {
			
			System.out.println(arrayNumbers[i]);
			
		}
		
	}

}

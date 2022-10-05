import java.util.Scanner;

public class C2_UD06_11_App {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Tamaño de los array: ");
		int length = keyboard.nextInt();
		
		int arrayNumbers1[] = new int[length];
		int arrayNumbers2[] = new int[length];
		
		keyboard.close();
		
		RellenarArrayRandom(arrayNumbers1);
		arrayNumbers2 = arrayNumbers1.clone();
		ReordenarArrayRandom(arrayNumbers2);
		
		int arrayMultiplicacion[] = new int[length];
		
		arrayMultiplicacion = MultiplicarArrays(arrayNumbers1, arrayNumbers2);
		
		System.out.println("Array 1:");
		MostrarTodosLosArrays(arrayNumbers1);
		System.out.println("Array 2:");
		MostrarTodosLosArrays(arrayNumbers2);
		System.out.println("Array multiplicada:");
		MostrarTodosLosArrays(arrayMultiplicacion);
		
	}
	
	private static void RellenarArrayRandom(int[] arrayNumbers) {
		
		for (int i = 0; i < arrayNumbers.length; i++) {
			
			int random = (int)Math.floor(Math.random() * (100));
			
			if (ComprovacionNoRepetir(arrayNumbers, random)) {
			
				arrayNumbers[i] = random;
			
			}
			
		}
		
	}

	private static void ReordenarArrayRandom(int[] arrayNumbers) {
		
		int arrayTemporal[] = arrayNumbers.clone();
		
		for (int i = 0; i < arrayNumbers.length; i++) {
			
			arrayNumbers[i] = 0;
			
		}
		
		for (int i = 0; i < arrayNumbers.length; i++) {
			
			int pos = 0;
			
			do {
				
				pos = (int)Math.floor(Math.random() * (arrayNumbers.length));
				
				if (ComprovacionNoRepetir(arrayNumbers, arrayTemporal, pos)) {
					
					arrayNumbers[i] = arrayTemporal[pos];
					
				}
				
			} while (arrayNumbers[i] == 0);
			
		}
		
	}
	
	private static boolean ComprovacionNoRepetir(int[] arrayNumbers, int random) {
		
		for (int i = 0; i < arrayNumbers.length; i++) {
			
			if (arrayNumbers[i] == random) {
				
				return false;
				
			}
			
		}
		
		return true;
	}
	
	private static boolean ComprovacionNoRepetir(int[] arrayNumbers, int[] arrayTemporal, int position) {
		
		for (int i = 0; i < arrayNumbers.length; i++) {
			
			if (arrayNumbers[i] == arrayTemporal[position]) {
				
				return false;
				
			}
			
		}
		
		return true;
		
	}

	private static int[] MultiplicarArrays(int[] arrayNumbers1, int[] arrayNumbers2) {
		
		int array[] = new int[arrayNumbers1.length];
		
		for (int i = 0; i < array.length; i++) {
			
			array[i] = arrayNumbers1[i] * arrayNumbers2[i];
			
		}
		
		return array;
	}
	
	private static void MostrarTodosLosArrays(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.println(array[i]);
			
		}
		
	}

}

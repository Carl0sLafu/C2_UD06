import java.util.Scanner;

public class C2_UD06_12_App {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Tamaño de los array: ");
		int length = keyboard.nextInt();
		
		int arrayNumbers[] = new int[length];
		
		RellenarArrayRandom(arrayNumbers);
		
		int digit = 0;
		
		do {
			
			System.out.println("Selecciona un digito: ");
			digit = keyboard.nextInt();
			
		} while (digit > 10);
		
		keyboard.close();
		
		int arrayFinalizadoDigito[] = ComprovaciónDigito(arrayNumbers, digit);
		
		System.out.println("Array aleatorio: ");
		MostrarArray(arrayNumbers);
		
		if (arrayFinalizadoDigito != null) {
			
			System.out.println("Array con numeros acabados en " + digit + ":");
			MostrarArray(arrayFinalizadoDigito);
		
		}

	}
	
	private static void MostrarArray(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.println(array[i]);
			
		}
		
	}

	private static void RellenarArrayRandom(int[] arrayNumbers) {
		
		for (int i = 0; i < arrayNumbers.length; i++) {
			
			arrayNumbers[i] = (int)Math.floor(Math.random() * (300) + 1);
			
		}
		
	}
	
	private static int[] ComprovaciónDigito(int[] arrayNumbers, int digit) {
		
		int falsoArray[] = new int[arrayNumbers.length];
		int contador = 0;
		
		for (int i = 0; i < arrayNumbers.length; i++) {
			
			if ((arrayNumbers[i] - digit) % 10 == 0) {
				
				falsoArray[i] = arrayNumbers[i];
				contador++;
				
			}
			
		}
		
		if (contador == 0) {
			
			System.out.println("No se ha encontrado ningún numero acabado por el digito " + digit);
			return null;
		
		}
		
		int arrayReturn[] = new int[contador];
		
		contador = 0;
		
		for (int i = 0; i < falsoArray.length; i++) {
			
			if (falsoArray[i] != 0) {
				
				arrayReturn[contador] = falsoArray[i];
				contador++;
				
			}
			
		}
		
		return arrayReturn;
		
	}

}

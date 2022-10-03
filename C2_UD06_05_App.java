import java.util.Scanner;

public class C2_UD06_05_App {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Introduce un número para traducirlo a binario: ");
		int number = keyboard.nextInt();
		
		keyboard.close();
		
		String binario = TraducirABinario(number);
		
		System.out.println(binario);
		
	}

	private static String TraducirABinario(int number) {
		
		String binario = "";
		int n = number;
	
		while (n > 0) {
	
			binario = (n % 2) + binario;

			n /= 2;

		}
		
		return binario;
		
	}

}

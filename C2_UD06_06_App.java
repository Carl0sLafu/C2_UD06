import java.util.Scanner;

public class C2_UD06_06_App {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int num = 0;
		
		do {
			
			System.out.print("Introduce un numero positivo: ");
			num = keyboard.nextInt();
			
		} while (num <= 0);
		
		keyboard.close();
		
		ContadorCifras(num);

	}

	private static void ContadorCifras(int num) {
		
		int contador = 0;
		int numberToExplote = num;
		
		while (numberToExplote >= 1) {
			
			contador++;
			numberToExplote /= 10;
	
		}
		
		System.out.println(num + " tiene " + contador + " cifras");
		
	}

}

import java.util.Scanner;

public class C2_UD06_03_App {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		int number = keyboard.nextInt();
		
		keyboard.close();
		
		System.out.println(ComprobarNumeroPrimo(number));

	}

	private static boolean ComprobarNumeroPrimo(int number) {
		
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

}

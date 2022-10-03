import java.util.Scanner;

public class C2_UD06_07_App {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Introduce la cantidad de euros: ");
		double number = keyboard.nextDouble();
		
		keyboard.nextLine();
		
		System.out.print("Introduce la moneda para cambiar: ");
		String moneda = keyboard.nextLine();
		
		keyboard.close();
		
		ConversorDeMonedas(number, moneda);
		

	}

	private static void ConversorDeMonedas(double number, String moneda) {
		
		switch (moneda.toLowerCase()) {
		
			case "libra":
				
				System.out.println("Valor de " + number + "€ en libras son " + (0.86 * number));
				
				break;
			
			case "dolar":
				
				System.out.println("Valor de " + number + "€ en dolares son " + (1.28611 * number));
				
				break;
				
			case "yen":
	
				System.out.println("Valor de " + number + "€ en yenes son " + (129.852 * number));
	
				break;
				
			default:
				
				System.out.println("Error al introducir la moneda");
		
		}
		
	}

}

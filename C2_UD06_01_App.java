import java.util.Scanner;

public class C2_UD06_01_App {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Introduce la figura para calcular su área: ");
		String figura = keyboard.nextLine();
		
		double area = 0;
		
		switch (figura.toLowerCase().trim()) {
		
			case "circulo":
				
				System.out.print("Introduce el radio: ");
				double radio = keyboard.nextDouble();
				
				area = CalculoAreaCirculo(radio);
				
				break;
				
			case "triangulo":
				System.out.print("Introduce la base: ");
				double base = keyboard.nextDouble();
				
				System.out.print("Introduce la altura: ");
				double altura = keyboard.nextDouble();
				
				area = CalculoAreaTriangulo(base, altura);
				
				break;
				
			case "cuadrado":
				
				System.out.print("Introduce el lado: ");
				double lado = keyboard.nextDouble();
				
				area = CalculoAreaCuadrado(lado);
				
				break;
				
			default:
				System.out.println("No has introducido ninguna figura correcta");
				System.exit(0);
		
		}
		
		keyboard.close();
		
		System.out.println("Área del " + figura.toLowerCase() + ": " + area);

	}

	private static double CalculoAreaCirculo(double radio) {
		
		return Math.pow(radio, 2) * Math.PI;
		
	}
	
	private static double CalculoAreaTriangulo(double base, double altura) {
		
		return (base * altura) / 2;
	}
	
	private static double CalculoAreaCuadrado(double lado) {
		
		return lado * lado;
	}

}

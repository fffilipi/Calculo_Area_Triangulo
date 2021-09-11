import java.util.Scanner;

public class Area_triangulo {

	public static void main(String[] args) {
		// Calculo da area do triangulo
		
		Scanner entrada = new Scanner(System.in);
		
		Double base, altura, area;
		
		System.out.println("DIGITE O VALOR DA BASE: ");
		base = entrada.nextDouble();

		System.out.println("DIGITE O VALOR DA ALTURA: ");
		altura = entrada.nextDouble();
		
		area = (base * altura) / 2; 
		
		System.out.printf("AREA = " + area);
		
		entrada.close();

	}

}

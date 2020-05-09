import java.util.Scanner;
//Creado por Sebastia Rojas
public class Caso_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		while (!(num >= 1 && num <= 100)) {
			System.out.print("Ingrese numero: ");
			num = sc.nextInt();
			
			if (num < 1 || num > 100)
				System.out.println("Numero fuera de rango, [1-100]");
		}
		
			
		for (int x = 1; x < 15; x++) {
			System.out.println(num + " * " + x + " = " + (num * x));
		}

	}

}

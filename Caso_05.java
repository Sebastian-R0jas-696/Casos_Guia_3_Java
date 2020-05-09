import java.util.Scanner;
//Creado por Sebastian Rojas
public class Caso_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1, n = 0, menor = 999999999;
		
		while (i <= 5) {
			System.out.print("Ingrese " + i + " numero: ");
			n = sc.nextInt();
			
			if (n < menor)
				menor = n;
			i++;
		}
		System.out.println("El menor numero es: " + menor);
	}

}

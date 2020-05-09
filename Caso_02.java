import java.util.Scanner;

import javax.sound.midi.Soundbank;
//Creado por Sebastian Rojas
public class Caso_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0, i = 0, s = 0;
		System.out.print("Ingrese numero: ");
		n = sc.nextInt();
		
		while (i <= n) {
			s += i;
			i++;
		}
		System.out.println("La sumatoria de " + n + " es: " + s);
		

	}

}

package UF4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Inserta el texto que deseas repetir:");
		String texto = teclado.nextLine();

		System.out.println("Inserta el número de veces que deseas repetir el texto:");
		int veces = teclado.nextInt();

		for (int i = 0; i < veces; i++) {
			System.out.println(texto);
		}

	}

}

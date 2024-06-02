package UF4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		String rojo = "\u001B[31m";
        String naranja = "\u001B[38;5;208m";
        String amarillo = "\u001B[33m";
        String verde = "\u001B[32m";
        String azul = "\u001B[36m";
        String morado = "\u001B[35m";
        String reset = "\u001B[0m"; 
        
        System.out.println(rojo + "F" + naranja + "e" + amarillo + "l" + verde + "i" + azul + "z" + morado + " " + rojo + "J" + naranja + "u" + amarillo + "n" + verde + "i" + azul + "o" + reset);

		System.out.println("Inserta el texto que deseas repetir:");
		String texto = teclado.nextLine();

		System.out.println("Inserta el número de veces que deseas repetir el texto:");
		int veces = teclado.nextInt();

		for (int i = 0; i < veces; i++) {
			System.out.println(texto);
		}

	}

}

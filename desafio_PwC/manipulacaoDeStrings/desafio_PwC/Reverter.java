package desafio_PwC;

import java.util.Scanner;

public class Reverter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Ola, digite a frase que deseja reverter a ordem:");

		String palavras[] = new String[5];

		for (int i = 0; i < palavras.length; i++) {
			palavras[i] = sc.next();
		}
		
		System.out.println("\nFrase invertida: ");
		for (int i = 4; i >= 0; i--) {
			System.out.printf(palavras[i] + " ");
		}
		sc.close();
	}
}

/*
 * 1. Reverta a ordem das palavras nas frases, mantendo a ordem das pelavras. a.
 * Input "Hello, World! OpenAI is amazing." b Output
 * "amazing is OpenAI World! Hello,"
 */
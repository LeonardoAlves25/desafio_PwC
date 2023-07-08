package desafio_PwC;

import java.util.Arrays;
import java.util.Scanner;

public class Reverter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String palavras[] = new String[5];
		int j = 0;

		for (int i = 0; i < palavras.length; i++) {
			palavras[j] = sc.next();
			j++;
		}
		System.out.printf(Arrays.toString(palavras));

		sc.close();
	}
}

/*
 * 1. Reverta a ordem das palavras nas frases, mantendo a ordem das pelavras. a.
 * Input "Hello, World! OpenAI is amazing." b Output
 * "amazing is OpenAI World! Hello,"
 */
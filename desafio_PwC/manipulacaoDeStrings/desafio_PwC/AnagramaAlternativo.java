package desafio_PwC;

import java.util.ArrayList;
import java.util.Scanner;

public class AnagramaAlternativo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a palavra que deseja verificar: ");

		String input = sc.next();
		ArrayList<Object> cont = new ArrayList<>();
		ArrayList<Object> inp = new ArrayList<>();

		for (int i = 0; i <= input.length() - 1; i++) {
			// System.out.print(input.charAt(i));
			inp.add(input.charAt(i));
		}

		System.out.println("\nAnagrama da palavra original:\n" + inp);

		for (int i = input.length() - 1; i >= 0; i--) {
			// System.out.print(input.charAt(i));
			cont.add(input.charAt(i));
		}

		System.out.println("\nAnagramas da palavra reversa:\n" + cont);

		if (inp.equals(cont)) {
			System.out.println("\n… anagrama de palindromo");
		} else {
			System.out.println("\nN„o È anagrama de palindromo");
		}

		sc.close();
	}
}

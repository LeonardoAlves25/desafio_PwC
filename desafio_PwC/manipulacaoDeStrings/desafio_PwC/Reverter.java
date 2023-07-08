package desafio_PwC;

public class Reverter {

	public static void main(String[] args) {

		String input[] = { " hello", " world", " OpenAI" };
		int j = 0;

		for (int i = 0; i <= 2; i++) {
			System.out.printf(input[j]);
			j++;
		}
		j = 2;
		System.out.println("");
		for (int k = 0; k <= 2; k++) {
			System.out.printf(input[j]);
			j--;
		}
	}
}

//int[] something = { 0, 1, 2 ,3, };
//System.out.println(something[2]);

/*
 * 1. Reverta a ordem das palavras nas frases, mantendo a ordem das pelavras. a.
 * Input "Hello, World! OpenAI is amazing." b Output
 * "amazing is OpenAI World! Hello,"
 */
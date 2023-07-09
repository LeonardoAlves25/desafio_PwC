package desafio_PwC;

public class Maiusculo {

	public static void main(String[] args) {

		String input = "hello. how are you? i'm fine, thank you.";
		char acum = ' ';
		String output = "";

		for (int i = 0; i <= input.length() - 1; i++) {
			input.charAt(i);

			if (i == 0 || i == 7 || i == 20) {
				acum = input.charAt(i);
				acum = Character.toUpperCase(acum);
				output += acum;
			} else {
				output += input.charAt(i);
			}
		}

		System.out.println(output);

	}

}

//0, 7, 20, 
//Coloque em maiúsculo a primeira letra de cada frase
//Input: "hello. how are you? i'm fine, thank you."
//Output: "Hello. How are you? I'm fine, thank you."
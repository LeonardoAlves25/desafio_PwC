package desafio_PwC;

public class Remover {

	public static void main(String[] args) {

		String frase = "Hello, World!";
		String repetidas = "";
		String letras = "";

		for (int i = 0; i < frase.length(); i++) {
			String atual = Character.toString(frase.charAt(i));

			if (letras.contains(atual)) {
				repetidas += atual;
			}

			letras += atual;
		}
		System.out.println(frase);
		
		System.out.println("\n" + repetidas);

	}
}

//Remova todos os caracteres duplicados
//na string abaixo: 
//Input: "Hello, World!"
//Output: "Helo, Wrd!"
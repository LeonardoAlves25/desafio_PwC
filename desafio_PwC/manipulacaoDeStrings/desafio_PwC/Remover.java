package desafio_PwC;

public class Remover {

	public static void main(String[] args) {

		String input = "Hello, World!";
		String repetidas = "";
		String letras = "";
		String output = "";
		
		for (int i = 0; i < input.length(); i++) {
			String atual = Character.toString(input.charAt(i));

			if (letras.contains(atual)) {
				repetidas += atual;
			}else {output += atual;}

			letras += atual;
		}
		System.out.println("\n A frase original é: "+input);
		
		System.out.println("\n A frase sem caracteres repetidos é: "+output);
		
		System.out.println("\n Os caracteres que se repetem são: " + repetidas);

	}
}

//Remova todos os caracteres duplicados
//na string abaixo: 
//Input: "Hello, World!"
//Output: "Helo, Wrd!"
package desafio_PwC;

import java.util.Scanner;

public class Anagrama {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Verifique se as palavras são anagramas");
		
		String input = sc.next();
		String input2 = sc.next();
		
		if(isAnagrama(input, input2))System.out.println("É anagrama");
		else System.out.println("Não é anagrama");
		
		sc.close();
	}
	
	private static boolean isAnagrama(String input, String input2) {
		int result = 0;
		
		for (int i = 0; i < input.length(); i++) {
			result = result ^ input.charAt(i);
		}
		
		for (int i = 0; i < input2.length(); i++) {
			result = result ^ input2.charAt(i);
		}
		
		return (result == 0) ;
	}
}

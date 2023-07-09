package desafio_PwC;

import java.util.Scanner;

public class Anagrama {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Verifique se È anagrama de um palindromo");
		
		String input = "\nDigite a primeira palavra: " + sc.next();
		String input2 = "\nDigite a segunda palavra: " + sc.next();
		
		if(isAnagrama(input, input2))System.out.println("\n… anagrama");
		else System.out.println("\nN„o È anagrama");
		
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

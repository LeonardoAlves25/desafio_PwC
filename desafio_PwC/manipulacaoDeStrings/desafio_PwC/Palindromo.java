package desafio_PwC;

import java.util.Scanner;

public class Palindromo {
	 
	public static void main(String[] args) {
	
		//ufa! Essa deu trabalho
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a palavra que deseja verificar: ");
		String input = sc.next();
		String rev = "";
		String comp = "";
		
		for (int i = input.length() -1 ; i >= 0; i--) {
			rev = rev+input.charAt(i);
		}
		
		for (int j = 0; j <= input.length() -1; j++) {
			if (input.charAt(j) == rev.charAt(j)) {
				comp = comp+rev.charAt(j);	
			}
		}
		
		System.out.println("\nA palavra reversa é: "+rev);
		
		if(input.equals(rev)) System.out.println("\nEsta palavra é palindroma!");
		else System.out.println("\nEsta palavra não é palindroma");

		if(comp != "")System.out.println("\nO palindromo mais próximo é: "+comp);
		else System.out.println("\nNão existe palindromo mais próximo");
		sc.close();
	}
}

//Encontre a substring palindroma mais longa
//na string abaixo
//Input: "babad"
//output: "bab" (Observação pode haver várias saídas válidas)
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
		
		System.out.println("\nA palavra reversa �: "+rev);
		
		if(input.equals(rev)) System.out.println("\nEsta palavra � palindroma!");
		else System.out.println("\nEsta palavra n�o � palindroma");

		if(comp != "")System.out.println("\nO palindromo mais pr�ximo �: "+comp);
		else System.out.println("\nN�o existe palindromo mais pr�ximo");
		sc.close();
	}
}

//Encontre a substring palindroma mais longa
//na string abaixo
//Input: "babad"
//output: "bab" (Observa��o pode haver v�rias sa�das v�lidas)
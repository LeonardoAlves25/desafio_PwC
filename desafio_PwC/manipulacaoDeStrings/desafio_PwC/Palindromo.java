package desafio_PwC;

import java.util.Scanner;

public class Palindromo {
	 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a palavra que deseja verificar: ");
		String input = sc.next();
		String rev = input;
		
		System.out.println(rev);
		sc.close();
	}
}

//Encontre a substring palindroma mais longa
//na string abaixo
//Input: "babad"
//output: "bab" (Observação pode haver várias saídas válidas)
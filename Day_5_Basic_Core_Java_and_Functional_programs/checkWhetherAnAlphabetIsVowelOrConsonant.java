package Day_5_Basic_Core_Java_and_Functional_programs;

import java.util.Scanner;

public class checkWhetherAnAlphabetIsVowelOrConsonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character : ");
		char ch = sc.next().charAt(0);
		switch(ch) {
			case 'a':	System.out.println("is a vowel");
						break;
			case 'e':	System.out.println("is a vowel");
						break;
			case 'i':	System.out.println("is a vowel");
						break;
			case 'o':	System.out.println("is a vowel");
						break;
			case 'u':	System.out.println("is a vowel");
						break;
			default:	System.out.println("Not a vowel");
						
		}
	}

}

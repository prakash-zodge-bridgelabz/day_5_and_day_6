package Day_5_Basic_Core_Java_and_Functional_programs;

import java.util.Scanner;

public class swapTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a : ");
		int a = sc.nextInt();
		System.out.println("Enter value of b : ");
		int b = sc.nextInt();
		System.out.println("Before swapping");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
	}

}

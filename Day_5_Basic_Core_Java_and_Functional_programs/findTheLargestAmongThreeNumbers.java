package Day_5_Basic_Core_Java_and_Functional_programs;

import java.util.Scanner;

public class findTheLargestAmongThreeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a : ");
		int a = sc.nextInt();
		System.out.println("Enter value of b : ");
		int b = sc.nextInt();
		System.out.println("Enter value of c : ");
		int c = sc.nextInt();
		if(a>b && a>c) {
			System.out.println(a+" is largest");
		}
		else if(b>a && b>c) {
			System.out.println(b+" is largest");
		}
		else {
			System.out.println(c+" is largest");
		}
	}

}

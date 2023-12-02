package Day_5_Basic_Core_Java_and_Functional_programs;

import java.util.Scanner;

public class checkWhetherANumberIsEvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int a = sc.nextInt();
		if(a%2==0) {
			System.out.println(a+" is Even");
		}
		else {
			System.out.println(a+" is Odd");
		}
	}

}

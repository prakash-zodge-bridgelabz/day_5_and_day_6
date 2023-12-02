package Day_5_Basic_Core_Java_and_Functional_programs;

import java.util.Scanner;

public class printPrimeFactorsOfNumberN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		int i;
		for (i = 2; i * i <= n; i++) {
			while (n % i == 0) {
				System.out.print(i +" ");
				n /= i;
			}
		}
		if (n > 1) {
			System.out.print(n);
		}
	}

}

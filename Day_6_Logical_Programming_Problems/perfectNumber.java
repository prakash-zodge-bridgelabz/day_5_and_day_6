package pushCode_1;

import java.util.Scanner;

public class perfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();					//28
		int sumOfDivisors=1;
		if(n<2) {
			System.out.println("Is not a perfect number");
		}
		else {
			for(int i=2;i*i<=n;i++) {
				if(n%i==0) {
					System.out.println(i+" + "+sumOfDivisors);
					sumOfDivisors += i;
					// If the divisor is not the square root..
					//add the divisor
	                if (i != n / i) {
	                    sumOfDivisors += n / i;
	                }
				}
			}
			if(sumOfDivisors == n) {
				//if the addition of divisors and actual input n is 
				//same then it is a perfect number
				System.out.println("Is a perfect number");
			}
			else {
				System.out.println("Is not a perfect number");
			}
		}
		
	}

}

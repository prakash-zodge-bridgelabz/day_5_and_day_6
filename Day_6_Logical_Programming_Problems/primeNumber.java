package pushCode_1;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		boolean flag = true;
	    for (int i = 2; i <= n / 2; i++) {
	      // condition for nonprime number
	      if (n % i == 0) {
	        flag = false;
	        break;
	      }
	    }

	    if (flag==true) {
	    	System.out.println(n + " is a prime number.");
	    }
	    else {
	    	System.out.println(n + " is not a prime number.");
	    }
	      
	}

}

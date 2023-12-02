package Day_5_Basic_Core_Java_and_Functional_programs;

import java.util.Scanner;
/*
a. Desc -> This program takes a command-line argument N and prints a table of the
	powers of 2 that are less than or equal to 2^N.
b. I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
c. Logic -> repeat until i equals N.
d. O/P -> Print the year is a Leap Year or not.
 */
public class powerOfTwo {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int year;
		if(n>=0 && n<31) {
			System.out.println("Powers of 2 table for N = " + n + ":");
	        for (int i = 0; i <= n; i++) {
	            int result = (int) Math.pow(2, i);
	            System.out.println("2^" + i + " = " + result);
	        }
		}
		else {
			System.out.println("Invalid input");
		}
	}

}

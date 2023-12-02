package Day_5_Basic_Core_Java_and_Functional_programs;

import java.util.Scanner;

public class harmonicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter harmonic number : ");
		int n = sc.nextInt();
		double res=0;
		if(n!=0) {
			for(int i=1;i<=n;i++) {
				res = res + (double)1/i;				
			}
			System.out.println("Harmonic value : "+res);
		}
		else {
			System.out.println("Invalid");
		}
	}

}

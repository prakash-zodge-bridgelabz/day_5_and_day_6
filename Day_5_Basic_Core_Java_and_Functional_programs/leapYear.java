package Day_5_Basic_Core_Java_and_Functional_programs;

import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year : ");
		int year = sc.nextInt();
		boolean leap=false;
		
		if(year % 4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					leap = true;
				}
				else {
					leap = false;
				}
			}
			else {
				leap = true;
			}
		}
		else {
			leap = false;
		}
		if(leap==true) {
			System.out.println("Leap year");
		}
		else {
			System.out.println("Not a leap year");
		}
	}

}

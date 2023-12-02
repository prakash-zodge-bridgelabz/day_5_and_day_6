package Day_5_Basic_Core_Java_and_Functional_programs;

import java.util.Scanner;
import java.util.Random;
public class flipCoinAndPrintPercentageOfHeadsAndTails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of times to flip coin : ");
		int num = sc.nextInt();
		Random rand = new Random();
		double randomNumber;
		double headPercentage=0;
		double tailPercentage=0;
		double headCount=0;
		double tailCount=0;
		for(int i=0;i<num;i++) {
			randomNumber = rand.nextDouble();
			if(randomNumber  < 0.5) {
				headCount++;
			}
			else {
				tailCount++;
			}
		}
		headPercentage = headCount/num * 100;
		tailPercentage = tailCount/num * 100;
		System.out.println("Head percentage :"+headPercentage+", head count : "+headCount);
		System.out.println("Tail percentage :"+tailPercentage+", tail count : "+tailCount);
	}
}

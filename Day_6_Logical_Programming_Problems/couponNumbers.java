package pushCode_1;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class couponNumbers {

	public static void main(String[] args) {
		int[] couponNumbers = { 1, 2, 3, 4, 5 }; 
		int totalRandomNumbers = generateDistinctCoupons(couponNumbers);

		System.out.println("Total random numbers needed: " + totalRandomNumbers);
	}
		private static int generateDistinctCoupons(int[] couponNumbers) {
		Set<Integer> distinctCoupons = new HashSet<>();
		int totalRandomNumbers = 0;

		while (distinctCoupons.size() < couponNumbers.length) {
			int randomNumber = generateRandomNumber();
			if (distinctCoupons.add(randomNumber)) {
				System.out.println("Generated coupon: " + randomNumber);
			}
			totalRandomNumbers++;
		}

		return totalRandomNumbers;
	}
		private static int generateRandomNumber() {
		Random random = new Random();
		return random.nextInt(Integer.MAX_VALUE);
	}

}

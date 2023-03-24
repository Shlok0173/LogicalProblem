package com.bridgelabz.logical;

/*esc -> Given N distinct Coupon Numbers, how many random numbers do you
need to generate a distinct coupon number? This program simulates this random
process.
b. I/P -> N Distinct Coupon Number
c. Logic -> repeatedly choose a random number and check whether it's a new one.
d. O/P -> total random number needed to have all distinct numbers.
e. Functions => Write Class Static Functions to generate random numbers and to
process distinct coupons.
 */
public class CuponNumber {

	public static void main(String args[]) {

		char[] dictstinctCouponNumbers = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".toCharArray();
		int max = 100000000;
		int randomNumber = (int) (Math.random() * max);
		StringBuilder st = new StringBuilder();
		// System.out.println(RandomNumber);
		while (randomNumber > 0) {
			st.append(dictstinctCouponNumbers[randomNumber % dictstinctCouponNumbers.length]);
			randomNumber = randomNumber / dictstinctCouponNumbers.length;
		}
		String couponCode = st.toString();
		System.out.println("CouponCode:" + " " + couponCode);
	}
}

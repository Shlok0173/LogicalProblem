package com.bridgelabz.logical;

import java.util.Scanner;

/*
 *  Reverse a number
In Java, we can reverse a number either by using for loop, while loop, or using recursion.
The simplest way to reverse a number is by using for loop or while loop. In order to
reverse a number, we have to follow the following steps:
a. We need to calculate the remainder of the number using the modulo
b. After that, we need to multiply the variable reverse by 10 and add the remainder into
it.
c. We then divide the number by 10 and repeat steps until the number becomes 0.
 */
public class ReverseNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int rem = 0;
		int rev = 0;
		while (num > 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		System.out.println(rev);
	}
}

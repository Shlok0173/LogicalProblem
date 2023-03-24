package com.bridgelabz.logical;

import java.util.Scanner;

/*
 * 3. Prime Number
Just like the Perfect number, the Prime number is also a special type of number. When
the number is divided greater than 1 and divided by 1 or itself is referred to as the Prime
number. 0 and 1 are not counted as prime numbers. All the even numbers can be
divided by 2, so 2 is the only even prime minister.
 */
public class PrimeNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int count = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0)
				count++;
		}
		if (count == 2) {
			System.out.println("Prime Number");
		} else {
			System.out.println("Not Prime Number");
		}
	}
}

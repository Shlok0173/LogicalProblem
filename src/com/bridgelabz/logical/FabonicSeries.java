package com.bridgelabz.logical;

/*
*  Fibonacci Series
Fibonacci series is a special type of series in which the next term is the sum of the
previous two terms. For example, if 0 and 1 are the two previous terms in a series, then
the next term will be 1(0+1).
*/
public class FabonicSeries {

	static void fibonacci(int n) {

		int num1 = 0;
		int num2 = 1;
		int temp = 0;

		while (temp < n) {
			System.out.println(num1 + " ");
			int num3 = num1 + num2;

			num1 = num2;
			num2 = num3;
			temp = temp + 1;

		}
	}

	public static void main(String args[]) {

		int n = 7;
		fibonacci(n);
	}
}

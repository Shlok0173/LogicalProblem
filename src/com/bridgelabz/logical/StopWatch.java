package com.bridgelabz.logical;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/*
 * 6. Simulate Stopwatch Program
a. Desc -> Write a Stopwatch Program for measuring the time that elapses between
the start and end clicks
b. I/P -> Start the Stopwatch and End the Stopwatch
c. Logic -> Measure the elapsed time between start and end
d. O/P -> Print the elapsed time.
 */
public class StopWatch {
	public static void main(String args[]) throws InterruptedException {
		System.out.println("Start StopWatch");
		long startStopWatch = System.currentTimeMillis();

		TimeUnit.SECONDS.sleep(3);
		System.out.println("End StopWatch");
		long endStopWatch = System.currentTimeMillis();

		long elapsedTime = endStopWatch - startStopWatch;

		System.out.println("ElapsedTime" + elapsedTime);
	}

}

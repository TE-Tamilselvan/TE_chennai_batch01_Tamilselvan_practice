package com.te.localrepository;

public class Assign1 {

	public static void main(String[] args) {

		int sum =0;

		for (int i = 0; i < args.length; i++) {

			sum = sum + Integer.parseInt(args[i]);
		}
		double average = sum / args.length;
		System.out.println("Average of " + args.length + " command line arguments is " + average);
	}
}